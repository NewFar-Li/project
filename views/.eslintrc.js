// https://eslint.org/docs/user-guide/configuring

module.exports = {
  root: true,
  parserOptions: {
    parser: 'babel-eslint'
  },
  env: {
    browser: true,
  },
  extends: [
    // https://github.com/vuejs/eslint-plugin-vue#priority-a-essential-error-prevention
    // consider switching to `plugin:vue/strongly-recommended` or `plugin:vue/recommended` for stricter rules.
    'plugin:vue/essential', 
    // https://github.com/standard/standard/blob/master/docs/RULES-en.md
    'standard'
  ],
  // required to lint *.vue files
  plugins: [
    'vue'
  ],
  // add your custom rules here
  rules: {
    // allow async-await
    'generator-star-spacing': 'off',
    'no-new': 'off',
    'indent': 'off',
    'no-trailing-spaces': 'off',
    'vue/valid-template-root':'off',
    'no-undef':'off',
    'space-before-blocks':'off',
    'space-before-function-paren':'off',
    'no-unused-vars':'off',
    'semi':'off',
    'quotes':'off',
    'no-multi-spaces':'off',
    'eqeqeq':'off',
    'no-fallthrough':'off',
    // allow debugger during development
    'no-debugger': process.env.NODE_ENV === 'production' ? 'error' : 'off'
  }
}
