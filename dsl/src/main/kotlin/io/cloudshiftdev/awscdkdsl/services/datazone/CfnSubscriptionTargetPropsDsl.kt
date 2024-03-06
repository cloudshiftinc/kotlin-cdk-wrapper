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
import software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps

/**
 * Properties for defining a `CfnSubscriptionTarget`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnSubscriptionTargetProps cfnSubscriptionTargetProps = CfnSubscriptionTargetProps.builder()
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
public class CfnSubscriptionTargetPropsDsl {
    private val cdkBuilder: CfnSubscriptionTargetProps.Builder =
        CfnSubscriptionTargetProps.builder()

    private val _applicableAssetTypes: MutableList<String> = mutableListOf()

    private val _authorizedPrincipals: MutableList<String> = mutableListOf()

    private val _subscriptionTargetConfig: MutableList<Any> = mutableListOf()

    /** @param applicableAssetTypes The asset types included in the subscription target. */
    public fun applicableAssetTypes(vararg applicableAssetTypes: String) {
        _applicableAssetTypes.addAll(listOf(*applicableAssetTypes))
    }

    /** @param applicableAssetTypes The asset types included in the subscription target. */
    public fun applicableAssetTypes(applicableAssetTypes: Collection<String>) {
        _applicableAssetTypes.addAll(applicableAssetTypes)
    }

    /**
     * @param authorizedPrincipals The authorized principals included in the subscription target.
     */
    public fun authorizedPrincipals(vararg authorizedPrincipals: String) {
        _authorizedPrincipals.addAll(listOf(*authorizedPrincipals))
    }

    /**
     * @param authorizedPrincipals The authorized principals included in the subscription target.
     */
    public fun authorizedPrincipals(authorizedPrincipals: Collection<String>) {
        _authorizedPrincipals.addAll(authorizedPrincipals)
    }

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain in which subscription target is
     *   created.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param environmentIdentifier The ID of the environment in which subscription target is
     *   created.
     */
    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param manageAccessRole The manage access role that is used to create the subscription
     *   target.
     */
    public fun manageAccessRole(manageAccessRole: String) {
        cdkBuilder.manageAccessRole(manageAccessRole)
    }

    /** @param name The name of the subscription target. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param provider The provider of the subscription target. */
    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    /** @param subscriptionTargetConfig The configuration of the subscription target. */
    public fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any) {
        _subscriptionTargetConfig.addAll(listOf(*subscriptionTargetConfig))
    }

    /** @param subscriptionTargetConfig The configuration of the subscription target. */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: Collection<Any>) {
        _subscriptionTargetConfig.addAll(subscriptionTargetConfig)
    }

    /** @param subscriptionTargetConfig The configuration of the subscription target. */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable) {
        cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig)
    }

    /** @param type The type of the subscription target. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSubscriptionTargetProps {
        if (_applicableAssetTypes.isNotEmpty())
            cdkBuilder.applicableAssetTypes(_applicableAssetTypes)
        if (_authorizedPrincipals.isNotEmpty())
            cdkBuilder.authorizedPrincipals(_authorizedPrincipals)
        if (_subscriptionTargetConfig.isNotEmpty())
            cdkBuilder.subscriptionTargetConfig(_subscriptionTargetConfig)
        return cdkBuilder.build()
    }
}
