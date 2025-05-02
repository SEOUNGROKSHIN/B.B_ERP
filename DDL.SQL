-- 기업 테이블
CREATE TABLE company (
                         company_id BIGSERIAL PRIMARY KEY,
                         company_name VARCHAR(255) NOT NULL,
                         industry_type VARCHAR(255),
                         address VARCHAR(255),
                         phone_number VARCHAR(50),
                         registration_date DATE
);

-- 부서 테이블
CREATE TABLE department (
                            department_id BIGSERIAL PRIMARY KEY,
                            department_name VARCHAR(255) NOT NULL,
                            company_id BIGINT NOT NULL,
                            FOREIGN KEY (company_id) REFERENCES company(company_id) ON DELETE CASCADE
);

-- 사원 테이블
CREATE TABLE employee (
                          employee_id BIGSERIAL PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          birth_date DATE,
                          email VARCHAR(255),
                          phone_number VARCHAR(50),
                          hire_date DATE,
                          department_id BIGINT,
                          company_id BIGINT NOT NULL,
                          FOREIGN KEY (department_id) REFERENCES department(department_id) ON DELETE SET NULL,
                          FOREIGN KEY (company_id) REFERENCES company(company_id) ON DELETE CASCADE
);

-- 인증서 테이블
CREATE TABLE certificate (
                             certificate_id BIGSERIAL PRIMARY KEY,
                             certificate_name VARCHAR(255) NOT NULL,
                             issuing_organization VARCHAR(255),
                             issue_date DATE,
                             expiration_date DATE
);

-- 교육 과정 테이블
CREATE TABLE course (
                        course_id BIGSERIAL PRIMARY KEY,
                        course_name VARCHAR(255) NOT NULL,
                        course_type VARCHAR(255),
                        start_date DATE,
                        end_date DATE,
                        instructor_name VARCHAR(255)
);

-- 수료 테이블
CREATE TABLE completion (
                            completion_id BIGSERIAL PRIMARY KEY,
                            employee_id BIGINT NOT NULL,
                            course_id BIGINT NOT NULL,
                            completion_date DATE,
                            score INTEGER,
                            FOREIGN KEY (employee_id) REFERENCES employee(employee_id) ON DELETE CASCADE,
                            FOREIGN KEY (course_id) REFERENCES course(course_id) ON DELETE CASCADE
);

-- 출석 테이블
CREATE TABLE attendance (
                            attendance_id BIGSERIAL PRIMARY KEY,
                            employee_id BIGINT NOT NULL,
                            course_id BIGINT NOT NULL,
                            attendance_date DATE,
                            attendance_status VARCHAR(50),
                            FOREIGN KEY (employee_id) REFERENCES employee(employee_id) ON DELETE CASCADE,
                            FOREIGN KEY (course_id) REFERENCES course(course_id) ON DELETE CASCADE
);
