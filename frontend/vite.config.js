import { defineConfig } from 'vite';
export default defineConfig({server:{proxy:{'/books':'http://localhost:8080'}},test:{environment:'jsdom'}});
