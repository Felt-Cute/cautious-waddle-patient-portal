<a id="readme-top"></a>
[![GitHub Stars][stars-shield]][stars-url]
[![GitHub Issues][issues-shield]][issues-url]
[![Current Version][version-shield]][repo-url]
[![Live Demo][live-demo-shield]][live-demo-url]


<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/dcat23/patient-portal">
    <img src="logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Patient Portal</h3>

  <p align="center">
    The Patient Portal Application will be a web-based platform allowing patients to manage various aspects
of their healthcare interactions with Santara Health in Norfolk.
    <br />
    <a href="https://github.com/dcat23/patient-portal"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/dcat23/patient-portal">View Demo</a>
    ·
    <a href="https://github.com/dcat23/patient-portal/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/dcat23/patient-portal/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
  </p>
</div>

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">Overview</a>
      <ul>
        <li><a href="#technical-stack">Tech Stack</a></li>
        <li><a href="#core-features">Core Features</a></li>
      </ul>
    </li>
    <li><a href="#setup">Setup</a></li>
    <li><a href="#modules">Modules</a></li>
    <li><a href="#api-reference">API Reference</a></li>
    <li><a href="#database-schema">Database Schema</a></li>
    <li><a href="#implementation-steps">Implementation Steps</a></li>
    <li>
        <a href="#additional-considerations">Additional Considerations</a>
        <ul>
            <li><a href="#bonus-features">Bonus Features</a></li>
            <li><a href="#to-do">To-Dos</a></li>
            <li><a href="#future-features">Future Features</a></li>
        </ul>
    </li>
    <li><a href="#contact">Contact</a></li>

  </ol>
</details>

---

<!-- Overview -->
## Overview
The Patient Portal Application will be a web-based platform allowing patients to manage various aspects
of their healthcare interactions with Santara Health in Norfolk.

This project will improve patient engagement, streamline administrative processes,
and enhance the overall healthcare experience.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## Technical Stack

- **Frontend**: React.js for a responsive and interactive user interface
- **Backend**: Java Spring Boot for robust API development and business logic
- **Database**: PostgreSQL for data persistence
- **Security**: Spring Security for authentication and authorization
- **API Documentation**: Swagger for clear API documentation

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- Core Features -->
## Core Features

1. **User Authentication and Profile Management**
   - [] Secure login system with multi-factor authentication
   - [] User profile creation and management
   - [] Password reset functionality
2. **Appointment Scheduling and Management**
   - [] Calendar integration for viewing available slots
   - [] Appointment booking, rescheduling, and cancellation
   - [] Automated reminders via email and SMS
3. **Medical Records and Test Results Viewer**
   - [] Secure display of patient medical history
   - [] Lab and test results presentation with historical data
   - [] Option to download and print records
4. **Secure Messaging System**
   - [] HIPAA-compliant messaging between patients and healthcare providers
   - [] File attachment capabilities for sharing documents or images
   - [] Notification system for new messages
5. **Prescription Refill Requests**
   - [] List of current prescriptions
   - [] Refill request form with automated routing to appropriate healthcare provider
   - [] Status tracking for refill requests
6. **Online Bill Payment**
   - [] Display of current and past bills
   - [] Multiple payment options (credit card, ACH, etc.)
   - [] Payment history and receipt generation

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- Setup -->
## Setup

Copy environment variables to the [.env](.env) file

```bash
cp .env.example .env
```

`DATABASE_HOST`
`DATABASE_PORT`
`DATABASE_NAME`
`DATABASE_PASSWORD`
`DATABASE_USER`
`JWT_SECRET`
`AWS_ACCESS_KEY_ID`
`AWS_SECRET_ACCESS_KEY`

Start the services

```bash
docker compose up -d
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- Modules -->
## Modules

### [Service]()
- **Functionality**: TODO
- **Core Features**: TODO

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- API Reference -->
## [API Reference](http://localhost:8080/actuator/gateway/routes)

### [User Management Service](http://localhost:8181/swagger-ui.html)
- `POST /api/users/register`
    - Register a new user (student or educator).
- `POST /api/users/login`
    - Authenticate a user and return an authentication token.
- `GET /api/users/{id}`
    - Retrieve user profile details by user ID.
- `GET /api/users/user`
    - Retrieve authenticated user details.
- `PUT /api/users/{id}` (admin)
    - Update user profile information (admin only).


<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- Database Schema -->
## Database Schema

### [User Management Service]()

#### [Users]()
- `id` (Primary key)
- `username`
- `email` (unique)
- `password`
- `roles` (ENUM: 'student', 'educator', `admin`)
- `created_at`


<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- Implementation Steps -->
## Implementation Steps

1. **Set Up the Development Environment**
    - [] Install Java Development Kit (JDK)
    - [] Set up a Spring Boot project using Spring Initializr
    - [] Configure the project structure and dependencies (e.g., Spring Web, Spring Data JPA, Spring Security)

2. **Design the Database Schema**
    - [] Create the database using PostgreSQL
    - [] Implement the database schema based on the defined tables for
    - [] Set up JPA entities corresponding to each table

3. **Implement User Management Service**
    - [] Create User entity and repository
    - [] Implement user registration and login functionality
    - [] Develop user profile management features
    - [] Set up password hashing and validation

4. **Implement User Authentication and Authorization**
    - [] Set up Spring Security for authentication
    - [] Implement role-based access control (e.g., student, educator, admin)
    - [] Configure JWT (JSON Web Tokens) for secure API access

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- Additional Considerations -->
## Additional Considerations
- **Data Privacy**: Ensure compliance with data protection regulations (e.g., GDPR, FERPA).
- **Accessibility**: Implement features to support users with disabilities (e.g., screen reader compatibility).
- **Scalability**: Design the architecture to handle increased user load and data volume.


<!-- Bonus Features -->
## Bonus Features

<!-- TO DO -->
## To-Do


<!-- Future Features -->
## Future Features


<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- CONTACT -->
## Contact

Devin Catuns - <a href="mailto:devincatuns1@gmail.com">devincatuns1@gmail.com</a>

[![LinkedIn][linkedin-shield]][linkedin-url]
[![portfolio][porfolio-shield]][portfolio-url]

[Fantastic Invention Learning Network][repo-url]


<p align="right">(<a href="#readme-top">back to top</a>)</p>

---
## Buy me a coffee

Whether you use this project, have learned something from it, or just like it, please consider supporting it by buying me a coffee, so I can dedicate more time on open-source projects like this :)

<a href="https://www.buymeacoffee.com/devincatunj" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[version-shield]: https://img.shields.io/badge/version-0.0.1-green.svg?style=for-the-badge
[contributors-shield]: https://img.shields.io/github/contributors/dcat23/patient-portal.svg?style=for-the-badge&logo=github
[contributors-url]: https://github.com/dcat23/patient-portal/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/dcat23/patient-portal.svg?style=for-the-badge
[forks-url]: https://github.com/dcat23/patient-portal/network/members
[stars-shield]: https://img.shields.io/github/stars/dcat23/patient-portal.svg?style=for-the-badge&&logo=github
[stars-url]: https://github.com/dcat23/patient-portal/stargazers
[issues-shield]: https://img.shields.io/github/issues/dcat23/patient-portal.svg?style=for-the-badge
[issues-url]: https://github.com/dcat23/patient-portal/issues
[license-shield]: https://img.shields.io/github/license/dcat23/patient-portal.svg?style=for-the-badge
[license-url]: https://github.com/dcat23/patient-portal/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=0A66C2
[linkedin-url]: https://www.linkedin.com/in/devin-catuns/
[live-demo-shield]: https://img.shields.io/badge/demo-offline-red.svg?style=for-the-badge
[live-demo-url]: https://filn.vercel.app
[repo-url]: https://github.com/dcat23/patient-portal
[porfolio-shield]: https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white
[portfolio-url]: https://dcat23.vercel.app/
