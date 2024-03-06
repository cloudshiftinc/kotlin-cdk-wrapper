@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.amplify

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnApp
import software.amazon.awscdk.services.amplify.CfnAppProps
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps
import software.amazon.awscdk.services.amplify.CfnDomain
import software.amazon.awscdk.services.amplify.CfnDomainProps
import software.constructs.Construct

public object amplify {
    /**
     * The AWS::Amplify::App resource specifies Apps in Amplify Hosting.
     *
     * An App is a collection of branches.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * CfnApp cfnApp = CfnApp.Builder.create(this, "MyCfnApp")
     * .name("name")
     * // the properties below are optional
     * .accessToken("accessToken")
     * .autoBranchCreationConfig(AutoBranchCreationConfigProperty.builder()
     * .autoBranchCreationPatterns(List.of("autoBranchCreationPatterns"))
     * .basicAuthConfig(BasicAuthConfigProperty.builder()
     * .enableBasicAuth(false)
     * .password("password")
     * .username("username")
     * .build())
     * .buildSpec("buildSpec")
     * .enableAutoBranchCreation(false)
     * .enableAutoBuild(false)
     * .enablePerformanceMode(false)
     * .enablePullRequestPreview(false)
     * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .framework("framework")
     * .pullRequestEnvironmentName("pullRequestEnvironmentName")
     * .stage("stage")
     * .build())
     * .basicAuthConfig(BasicAuthConfigProperty.builder()
     * .enableBasicAuth(false)
     * .password("password")
     * .username("username")
     * .build())
     * .buildSpec("buildSpec")
     * .customHeaders("customHeaders")
     * .customRules(List.of(CustomRuleProperty.builder()
     * .source("source")
     * .target("target")
     * // the properties below are optional
     * .condition("condition")
     * .status("status")
     * .build()))
     * .description("description")
     * .enableBranchAutoDeletion(false)
     * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .iamServiceRole("iamServiceRole")
     * .oauthToken("oauthToken")
     * .platform("platform")
     * .repository("repository")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html)
     */
    public inline fun cfnApp(
        scope: Construct,
        id: String,
        block: CfnAppDsl.() -> Unit = {},
    ): CfnApp {
        val builder = CfnAppDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the AutoBranchCreationConfig property type to automatically create branches that match a
     * certain pattern.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * AutoBranchCreationConfigProperty autoBranchCreationConfigProperty =
     * AutoBranchCreationConfigProperty.builder()
     * .autoBranchCreationPatterns(List.of("autoBranchCreationPatterns"))
     * .basicAuthConfig(BasicAuthConfigProperty.builder()
     * .enableBasicAuth(false)
     * .password("password")
     * .username("username")
     * .build())
     * .buildSpec("buildSpec")
     * .enableAutoBranchCreation(false)
     * .enableAutoBuild(false)
     * .enablePerformanceMode(false)
     * .enablePullRequestPreview(false)
     * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .framework("framework")
     * .pullRequestEnvironmentName("pullRequestEnvironmentName")
     * .stage("stage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html)
     */
    public inline fun cfnAppAutoBranchCreationConfigProperty(
        block: CfnAppAutoBranchCreationConfigPropertyDsl.() -> Unit = {}
    ): CfnApp.AutoBranchCreationConfigProperty {
        val builder = CfnAppAutoBranchCreationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the BasicAuthConfig property type to set password protection at an app level to all your
     * branches.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * BasicAuthConfigProperty basicAuthConfigProperty = BasicAuthConfigProperty.builder()
     * .enableBasicAuth(false)
     * .password("password")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html)
     */
    public inline fun cfnAppBasicAuthConfigProperty(
        block: CfnAppBasicAuthConfigPropertyDsl.() -> Unit = {}
    ): CfnApp.BasicAuthConfigProperty {
        val builder = CfnAppBasicAuthConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CustomRule property type allows you to specify redirects, rewrites, and reverse proxies.
     *
     * Redirects enable a web app to reroute navigation from one URL to another.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * CustomRuleProperty customRuleProperty = CustomRuleProperty.builder()
     * .source("source")
     * .target("target")
     * // the properties below are optional
     * .condition("condition")
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html)
     */
    public inline fun cfnAppCustomRuleProperty(
        block: CfnAppCustomRulePropertyDsl.() -> Unit = {}
    ): CfnApp.CustomRuleProperty {
        val builder = CfnAppCustomRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Environment variables are key-value pairs that are available at build time.
     *
     * Set environment variables for all branches in your app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-environmentvariable.html)
     */
    public inline fun cfnAppEnvironmentVariableProperty(
        block: CfnAppEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnApp.EnvironmentVariableProperty {
        val builder = CfnAppEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApp`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * CfnAppProps cfnAppProps = CfnAppProps.builder()
     * .name("name")
     * // the properties below are optional
     * .accessToken("accessToken")
     * .autoBranchCreationConfig(AutoBranchCreationConfigProperty.builder()
     * .autoBranchCreationPatterns(List.of("autoBranchCreationPatterns"))
     * .basicAuthConfig(BasicAuthConfigProperty.builder()
     * .enableBasicAuth(false)
     * .password("password")
     * .username("username")
     * .build())
     * .buildSpec("buildSpec")
     * .enableAutoBranchCreation(false)
     * .enableAutoBuild(false)
     * .enablePerformanceMode(false)
     * .enablePullRequestPreview(false)
     * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .framework("framework")
     * .pullRequestEnvironmentName("pullRequestEnvironmentName")
     * .stage("stage")
     * .build())
     * .basicAuthConfig(BasicAuthConfigProperty.builder()
     * .enableBasicAuth(false)
     * .password("password")
     * .username("username")
     * .build())
     * .buildSpec("buildSpec")
     * .customHeaders("customHeaders")
     * .customRules(List.of(CustomRuleProperty.builder()
     * .source("source")
     * .target("target")
     * // the properties below are optional
     * .condition("condition")
     * .status("status")
     * .build()))
     * .description("description")
     * .enableBranchAutoDeletion(false)
     * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .iamServiceRole("iamServiceRole")
     * .oauthToken("oauthToken")
     * .platform("platform")
     * .repository("repository")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html)
     */
    public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
        val builder = CfnAppPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Amplify::Branch resource specifies a new branch within an app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * CfnBranch cfnBranch = CfnBranch.Builder.create(this, "MyCfnBranch")
     * .appId("appId")
     * .branchName("branchName")
     * // the properties below are optional
     * .backend(BackendProperty.builder()
     * .stackArn("stackArn")
     * .build())
     * .basicAuthConfig(BasicAuthConfigProperty.builder()
     * .password("password")
     * .username("username")
     * // the properties below are optional
     * .enableBasicAuth(false)
     * .build())
     * .buildSpec("buildSpec")
     * .description("description")
     * .enableAutoBuild(false)
     * .enablePerformanceMode(false)
     * .enablePullRequestPreview(false)
     * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .framework("framework")
     * .pullRequestEnvironmentName("pullRequestEnvironmentName")
     * .stage("stage")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html)
     */
    public inline fun cfnBranch(
        scope: Construct,
        id: String,
        block: CfnBranchDsl.() -> Unit = {},
    ): CfnBranch {
        val builder = CfnBranchDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the backend properties associated with an Amplify `Branch` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * BackendProperty backendProperty = BackendProperty.builder()
     * .stackArn("stackArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-backend.html)
     */
    public inline fun cfnBranchBackendProperty(
        block: CfnBranchBackendPropertyDsl.() -> Unit = {}
    ): CfnBranch.BackendProperty {
        val builder = CfnBranchBackendPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the BasicAuthConfig property type to set password protection for a specific branch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * BasicAuthConfigProperty basicAuthConfigProperty = BasicAuthConfigProperty.builder()
     * .password("password")
     * .username("username")
     * // the properties below are optional
     * .enableBasicAuth(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html)
     */
    public inline fun cfnBranchBasicAuthConfigProperty(
        block: CfnBranchBasicAuthConfigPropertyDsl.() -> Unit = {}
    ): CfnBranch.BasicAuthConfigProperty {
        val builder = CfnBranchBasicAuthConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The EnvironmentVariable property type sets environment variables for a specific branch.
     *
     * Environment variables are key-value pairs that are available at build time.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-environmentvariable.html)
     */
    public inline fun cfnBranchEnvironmentVariableProperty(
        block: CfnBranchEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnBranch.EnvironmentVariableProperty {
        val builder = CfnBranchEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBranch`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * CfnBranchProps cfnBranchProps = CfnBranchProps.builder()
     * .appId("appId")
     * .branchName("branchName")
     * // the properties below are optional
     * .backend(BackendProperty.builder()
     * .stackArn("stackArn")
     * .build())
     * .basicAuthConfig(BasicAuthConfigProperty.builder()
     * .password("password")
     * .username("username")
     * // the properties below are optional
     * .enableBasicAuth(false)
     * .build())
     * .buildSpec("buildSpec")
     * .description("description")
     * .enableAutoBuild(false)
     * .enablePerformanceMode(false)
     * .enablePullRequestPreview(false)
     * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .framework("framework")
     * .pullRequestEnvironmentName("pullRequestEnvironmentName")
     * .stage("stage")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html)
     */
    public inline fun cfnBranchProps(block: CfnBranchPropsDsl.() -> Unit = {}): CfnBranchProps {
        val builder = CfnBranchPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Amplify::Domain resource allows you to connect a custom domain to your app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .appId("appId")
     * .domainName("domainName")
     * .subDomainSettings(List.of(SubDomainSettingProperty.builder()
     * .branchName("branchName")
     * .prefix("prefix")
     * .build()))
     * // the properties below are optional
     * .autoSubDomainCreationPatterns(List.of("autoSubDomainCreationPatterns"))
     * .autoSubDomainIamRole("autoSubDomainIamRole")
     * .enableAutoSubDomain(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html)
     */
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .appId("appId")
     * .domainName("domainName")
     * .subDomainSettings(List.of(SubDomainSettingProperty.builder()
     * .branchName("branchName")
     * .prefix("prefix")
     * .build()))
     * // the properties below are optional
     * .autoSubDomainCreationPatterns(List.of("autoSubDomainCreationPatterns"))
     * .autoSubDomainIamRole("autoSubDomainIamRole")
     * .enableAutoSubDomain(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The SubDomainSetting property type enables you to connect a subdomain (for example,
     * example.exampledomain.com) to a specific branch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplify.*;
     * SubDomainSettingProperty subDomainSettingProperty = SubDomainSettingProperty.builder()
     * .branchName("branchName")
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-subdomainsetting.html)
     */
    public inline fun cfnDomainSubDomainSettingProperty(
        block: CfnDomainSubDomainSettingPropertyDsl.() -> Unit = {}
    ): CfnDomain.SubDomainSettingProperty {
        val builder = CfnDomainSubDomainSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
