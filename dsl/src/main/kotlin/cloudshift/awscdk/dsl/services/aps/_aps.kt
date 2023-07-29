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

package cloudshift.awscdk.dsl.services.aps

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps
import software.amazon.awscdk.services.aps.CfnWorkspace
import software.amazon.awscdk.services.aps.CfnWorkspaceProps
import software.constructs.Construct

public object aps {
    /**
     * The `AWS::APS::RuleGroupsNamespace` resource creates or updates a rule groups namespace
     * within a Amazon Managed Service for Prometheus workspace.
     *
     * For more information, see
     * [Recording rules and alerting rules](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.aps.*;
     * CfnRuleGroupsNamespace cfnRuleGroupsNamespace = CfnRuleGroupsNamespace.Builder.create(this,
     * "MyCfnRuleGroupsNamespace")
     * .data("data")
     * .name("name")
     * .workspace("workspace")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html)
     */
    public inline fun cfnRuleGroupsNamespace(
        scope: Construct,
        id: String,
        block: CfnRuleGroupsNamespaceDsl.() -> Unit = {},
    ): CfnRuleGroupsNamespace {
        val builder = CfnRuleGroupsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRuleGroupsNamespace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.aps.*;
     * CfnRuleGroupsNamespaceProps cfnRuleGroupsNamespaceProps = CfnRuleGroupsNamespaceProps.builder()
     * .data("data")
     * .name("name")
     * .workspace("workspace")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html)
     */
    public inline fun cfnRuleGroupsNamespaceProps(
        block: CfnRuleGroupsNamespacePropsDsl.() -> Unit = {}
    ): CfnRuleGroupsNamespaceProps {
        val builder = CfnRuleGroupsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::APS::Workspace` type specifies an Amazon Managed Service for Prometheus ( Amazon
     * Managed Service for Prometheus ) workspace.
     *
     * A *workspace* is a logical and isolated Prometheus server dedicated to Prometheus resources
     * such as metrics. You can have one or more workspaces in each Region in your account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.aps.*;
     * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
     * .alertManagerDefinition("alertManagerDefinition")
     * .alias("alias")
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html)
     */
    public inline fun cfnWorkspace(
        scope: Construct,
        id: String,
        block: CfnWorkspaceDsl.() -> Unit = {},
    ): CfnWorkspace {
        val builder = CfnWorkspaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The LoggingConfiguration attribute sets the logging configuration for the workspace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.aps.*;
     * LoggingConfigurationProperty loggingConfigurationProperty =
     * LoggingConfigurationProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingconfiguration.html)
     */
    public inline fun cfnWorkspaceLoggingConfigurationProperty(
        block: CfnWorkspaceLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.LoggingConfigurationProperty {
        val builder = CfnWorkspaceLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWorkspace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.aps.*;
     * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
     * .alertManagerDefinition("alertManagerDefinition")
     * .alias("alias")
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html)
     */
    public inline fun cfnWorkspaceProps(
        block: CfnWorkspacePropsDsl.() -> Unit = {}
    ): CfnWorkspaceProps {
        val builder = CfnWorkspacePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
