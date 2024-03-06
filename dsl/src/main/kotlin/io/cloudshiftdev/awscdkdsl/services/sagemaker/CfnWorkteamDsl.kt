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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.constructs.Construct

/**
 * Creates a new work team for labeling your data.
 *
 * A work team is defined by one or more Amazon Cognito user pools. You must first create the user
 * pools before you can create a work team.
 *
 * You cannot create more than 25 work teams in an account and region.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnWorkteam cfnWorkteam = CfnWorkteam.Builder.create(this, "MyCfnWorkteam")
 * .description("description")
 * .memberDefinitions(List.of(MemberDefinitionProperty.builder()
 * .cognitoMemberDefinition(CognitoMemberDefinitionProperty.builder()
 * .cognitoClientId("cognitoClientId")
 * .cognitoUserGroup("cognitoUserGroup")
 * .cognitoUserPool("cognitoUserPool")
 * .build())
 * .oidcMemberDefinition(OidcMemberDefinitionProperty.builder()
 * .oidcGroups(List.of("oidcGroups"))
 * .build())
 * .build()))
 * .notificationConfiguration(NotificationConfigurationProperty.builder()
 * .notificationTopicArn("notificationTopicArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workforceName("workforceName")
 * .workteamName("workteamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html)
 */
@CdkDslMarker
public class CfnWorkteamDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWorkteam.Builder = CfnWorkteam.Builder.create(scope, id)

    private val _memberDefinitions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description)
     *
     * @param description A description of the work team.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For
     * workforces created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     *
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     *   identify the workers that make up the work team.
     */
    public fun memberDefinitions(vararg memberDefinitions: Any) {
        _memberDefinitions.addAll(listOf(*memberDefinitions))
    }

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For
     * workforces created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     *
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     *   identify the workers that make up the work team.
     */
    public fun memberDefinitions(memberDefinitions: Collection<Any>) {
        _memberDefinitions.addAll(memberDefinitions)
    }

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For
     * workforces created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     *
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     *   identify the workers that make up the work team.
     */
    public fun memberDefinitions(memberDefinitions: IResolvable) {
        cdkBuilder.memberDefinitions(memberDefinitions)
    }

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     *
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     *   items for work teams.
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     *
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     *   items for work teams.
     */
    public fun notificationConfiguration(
        notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty
    ) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the workforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workforcename)
     *
     * @param workforceName The name of the workforce.
     */
    public fun workforceName(workforceName: String) {
        cdkBuilder.workforceName(workforceName)
    }

    /**
     * The name of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname)
     *
     * @param workteamName The name of the work team.
     */
    public fun workteamName(workteamName: String) {
        cdkBuilder.workteamName(workteamName)
    }

    public fun build(): CfnWorkteam {
        if (_memberDefinitions.isNotEmpty()) cdkBuilder.memberDefinitions(_memberDefinitions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
