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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnSubscriptionTarget
import software.constructs.Construct

/**
 * The `AWS::DataZone::SubscriptionTarget` resource specifies an Amazon DataZone subscription
 * target.
 *
 * Subscription targets enable you to access the data to which you have subscribed in your projects.
 * A subscription target specifies the location (for example, a database or a schema) and the
 * required permissions (for example, an IAM role) that Amazon DataZone can use to establish a
 * connection with the source data and to create the necessary grants so that members of the Amazon
 * DataZone project can start querying the data to which they have subscribed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnSubscriptionTarget cfnSubscriptionTarget = CfnSubscriptionTarget.Builder.create(this,
 * "MyCfnSubscriptionTarget")
 * .applicableAssetTypes(List.of("applicableAssetTypes"))
 * .authorizedPrincipals(List.of("authorizedPrincipals"))
 * .domainIdentifier("domainIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .manageAccessRole("manageAccessRole")
 * .name("name")
 * .subscriptionTargetConfig(List.of(SubscriptionTargetFormProperty.builder()
 * .content("content")
 * .formName("formName")
 * .build()))
 * .type("type")
 * // the properties below are optional
 * .provider("provider")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html)
 */
@CdkDslMarker
public class CfnSubscriptionTargetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubscriptionTarget.Builder =
        CfnSubscriptionTarget.Builder.create(scope, id)

    private val _applicableAssetTypes: MutableList<String> = mutableListOf()

    private val _authorizedPrincipals: MutableList<String> = mutableListOf()

    private val _subscriptionTargetConfig: MutableList<Any> = mutableListOf()

    /**
     * The asset types included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
     *
     * @param applicableAssetTypes The asset types included in the subscription target.
     */
    public fun applicableAssetTypes(vararg applicableAssetTypes: String) {
        _applicableAssetTypes.addAll(listOf(*applicableAssetTypes))
    }

    /**
     * The asset types included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
     *
     * @param applicableAssetTypes The asset types included in the subscription target.
     */
    public fun applicableAssetTypes(applicableAssetTypes: Collection<String>) {
        _applicableAssetTypes.addAll(applicableAssetTypes)
    }

    /**
     * The authorized principals included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
     *
     * @param authorizedPrincipals The authorized principals included in the subscription target.
     */
    public fun authorizedPrincipals(vararg authorizedPrincipals: String) {
        _authorizedPrincipals.addAll(listOf(*authorizedPrincipals))
    }

    /**
     * The authorized principals included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
     *
     * @param authorizedPrincipals The authorized principals included in the subscription target.
     */
    public fun authorizedPrincipals(authorizedPrincipals: Collection<String>) {
        _authorizedPrincipals.addAll(authorizedPrincipals)
    }

    /**
     * The ID of the Amazon DataZone domain in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-domainidentifier)
     *
     * @param domainIdentifier The ID of the Amazon DataZone domain in which subscription target is
     *   created.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The ID of the environment in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-environmentidentifier)
     *
     * @param environmentIdentifier The ID of the environment in which subscription target is
     *   created.
     */
    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The manage access role that is used to create the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-manageaccessrole)
     *
     * @param manageAccessRole The manage access role that is used to create the subscription
     *   target.
     */
    public fun manageAccessRole(manageAccessRole: String) {
        cdkBuilder.manageAccessRole(manageAccessRole)
    }

    /**
     * The name of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-name)
     *
     * @param name The name of the subscription target.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The provider of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-provider)
     *
     * @param provider The provider of the subscription target.
     */
    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     *
     * @param subscriptionTargetConfig The configuration of the subscription target.
     */
    public fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any) {
        _subscriptionTargetConfig.addAll(listOf(*subscriptionTargetConfig))
    }

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     *
     * @param subscriptionTargetConfig The configuration of the subscription target.
     */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: Collection<Any>) {
        _subscriptionTargetConfig.addAll(subscriptionTargetConfig)
    }

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     *
     * @param subscriptionTargetConfig The configuration of the subscription target.
     */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable) {
        cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig)
    }

    /**
     * The type of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-type)
     *
     * @param type The type of the subscription target.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSubscriptionTarget {
        if (_applicableAssetTypes.isNotEmpty())
            cdkBuilder.applicableAssetTypes(_applicableAssetTypes)
        if (_authorizedPrincipals.isNotEmpty())
            cdkBuilder.authorizedPrincipals(_authorizedPrincipals)
        if (_subscriptionTargetConfig.isNotEmpty())
            cdkBuilder.subscriptionTargetConfig(_subscriptionTargetConfig)
        return cdkBuilder.build()
    }
}
