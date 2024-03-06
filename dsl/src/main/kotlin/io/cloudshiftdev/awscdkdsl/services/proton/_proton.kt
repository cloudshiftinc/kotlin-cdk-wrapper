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

package io.cloudshiftdev.awscdkdsl.services.proton

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection
import software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps
import software.amazon.awscdk.services.proton.CfnEnvironmentTemplate
import software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps
import software.amazon.awscdk.services.proton.CfnServiceTemplate
import software.amazon.awscdk.services.proton.CfnServiceTemplateProps
import software.constructs.Construct

public object proton {
    /**
     * Detailed data of an AWS Proton environment account connection resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.proton.*;
     * CfnEnvironmentAccountConnection cfnEnvironmentAccountConnection =
     * CfnEnvironmentAccountConnection.Builder.create(this, "MyCfnEnvironmentAccountConnection")
     * .codebuildRoleArn("codebuildRoleArn")
     * .componentRoleArn("componentRoleArn")
     * .environmentAccountId("environmentAccountId")
     * .environmentName("environmentName")
     * .managementAccountId("managementAccountId")
     * .roleArn("roleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html)
     */
    public inline fun cfnEnvironmentAccountConnection(
        scope: Construct,
        id: String,
        block: CfnEnvironmentAccountConnectionDsl.() -> Unit = {},
    ): CfnEnvironmentAccountConnection {
        val builder = CfnEnvironmentAccountConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironmentAccountConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.proton.*;
     * CfnEnvironmentAccountConnectionProps cfnEnvironmentAccountConnectionProps =
     * CfnEnvironmentAccountConnectionProps.builder()
     * .codebuildRoleArn("codebuildRoleArn")
     * .componentRoleArn("componentRoleArn")
     * .environmentAccountId("environmentAccountId")
     * .environmentName("environmentName")
     * .managementAccountId("managementAccountId")
     * .roleArn("roleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html)
     */
    public inline fun cfnEnvironmentAccountConnectionProps(
        block: CfnEnvironmentAccountConnectionPropsDsl.() -> Unit = {}
    ): CfnEnvironmentAccountConnectionProps {
        val builder = CfnEnvironmentAccountConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create an environment template for AWS Proton .
     *
     * For more information, see
     * [Environment Templates](https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html)
     * in the *AWS Proton User Guide* .
     *
     * You can create an environment template in one of the two following ways:
     * * Register and publish a *standard* environment template that instructs AWS Proton to deploy
     *   and manage environment infrastructure.
     * * Register and publish a *customer managed* environment template that connects AWS Proton to
     *   your existing provisioned infrastructure that you manage. AWS Proton *doesn't* manage your
     *   existing provisioned infrastructure. To create an environment template for customer
     *   provisioned and managed infrastructure, include the `provisioning` parameter and set the
     *   value to `CUSTOMER_MANAGED` . For more information, see
     *   [Register and publish an environment template](https://docs.aws.amazon.com/proton/latest/userguide/template-create.html)
     *   in the *AWS Proton User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.proton.*;
     * CfnEnvironmentTemplate cfnEnvironmentTemplate = CfnEnvironmentTemplate.Builder.create(this,
     * "MyCfnEnvironmentTemplate")
     * .description("description")
     * .displayName("displayName")
     * .encryptionKey("encryptionKey")
     * .name("name")
     * .provisioning("provisioning")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html)
     */
    public inline fun cfnEnvironmentTemplate(
        scope: Construct,
        id: String,
        block: CfnEnvironmentTemplateDsl.() -> Unit = {},
    ): CfnEnvironmentTemplate {
        val builder = CfnEnvironmentTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironmentTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.proton.*;
     * CfnEnvironmentTemplateProps cfnEnvironmentTemplateProps = CfnEnvironmentTemplateProps.builder()
     * .description("description")
     * .displayName("displayName")
     * .encryptionKey("encryptionKey")
     * .name("name")
     * .provisioning("provisioning")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html)
     */
    public inline fun cfnEnvironmentTemplateProps(
        block: CfnEnvironmentTemplatePropsDsl.() -> Unit = {}
    ): CfnEnvironmentTemplateProps {
        val builder = CfnEnvironmentTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a service template.
     *
     * The administrator creates a service template to define standardized infrastructure and an
     * optional CI/CD service pipeline. Developers, in turn, select the service template from AWS
     * Proton . If the selected service template includes a service pipeline definition, they
     * provide a link to their source code repository. AWS Proton then deploys and manages the
     * infrastructure defined by the selected service template. For more information, see
     * [AWS Proton templates](https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html)
     * in the *AWS Proton User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.proton.*;
     * CfnServiceTemplate cfnServiceTemplate = CfnServiceTemplate.Builder.create(this,
     * "MyCfnServiceTemplate")
     * .description("description")
     * .displayName("displayName")
     * .encryptionKey("encryptionKey")
     * .name("name")
     * .pipelineProvisioning("pipelineProvisioning")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html)
     */
    public inline fun cfnServiceTemplate(
        scope: Construct,
        id: String,
        block: CfnServiceTemplateDsl.() -> Unit = {},
    ): CfnServiceTemplate {
        val builder = CfnServiceTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.proton.*;
     * CfnServiceTemplateProps cfnServiceTemplateProps = CfnServiceTemplateProps.builder()
     * .description("description")
     * .displayName("displayName")
     * .encryptionKey("encryptionKey")
     * .name("name")
     * .pipelineProvisioning("pipelineProvisioning")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html)
     */
    public inline fun cfnServiceTemplateProps(
        block: CfnServiceTemplatePropsDsl.() -> Unit = {}
    ): CfnServiceTemplateProps {
        val builder = CfnServiceTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
