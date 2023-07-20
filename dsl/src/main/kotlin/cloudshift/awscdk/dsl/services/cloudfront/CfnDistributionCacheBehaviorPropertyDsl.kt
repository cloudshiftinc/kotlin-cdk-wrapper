@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionCacheBehaviorPropertyDsl {
    private val cdkBuilder: CfnDistribution.CacheBehaviorProperty.Builder =
        CfnDistribution.CacheBehaviorProperty.builder()

    private val _allowedMethods: MutableList<String> = mutableListOf()

    private val _cachedMethods: MutableList<String> = mutableListOf()

    private val _functionAssociations: MutableList<Any> = mutableListOf()

    private val _lambdaFunctionAssociations: MutableList<Any> = mutableListOf()

    private val _trustedKeyGroups: MutableList<String> = mutableListOf()

    private val _trustedSigners: MutableList<String> = mutableListOf()

    public fun allowedMethods(vararg allowedMethods: String) {
        _allowedMethods.addAll(listOf(*allowedMethods))
    }

    public fun allowedMethods(allowedMethods: Collection<String>) {
        _allowedMethods.addAll(allowedMethods)
    }

    public fun cachePolicyId(cachePolicyId: String) {
        cdkBuilder.cachePolicyId(cachePolicyId)
    }

    public fun cachedMethods(vararg cachedMethods: String) {
        _cachedMethods.addAll(listOf(*cachedMethods))
    }

    public fun cachedMethods(cachedMethods: Collection<String>) {
        _cachedMethods.addAll(cachedMethods)
    }

    public fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
    }

    public fun compress(compress: IResolvable) {
        cdkBuilder.compress(compress)
    }

    public fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    public fun fieldLevelEncryptionId(fieldLevelEncryptionId: String) {
        cdkBuilder.fieldLevelEncryptionId(fieldLevelEncryptionId)
    }

    public fun forwardedValues(forwardedValues: IResolvable) {
        cdkBuilder.forwardedValues(forwardedValues)
    }

    public fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty) {
        cdkBuilder.forwardedValues(forwardedValues)
    }

    public fun functionAssociations(vararg functionAssociations: Any) {
        _functionAssociations.addAll(listOf(*functionAssociations))
    }

    public fun functionAssociations(functionAssociations: Collection<Any>) {
        _functionAssociations.addAll(functionAssociations)
    }

    public fun functionAssociations(functionAssociations: IResolvable) {
        cdkBuilder.functionAssociations(functionAssociations)
    }

    public fun lambdaFunctionAssociations(vararg lambdaFunctionAssociations: Any) {
        _lambdaFunctionAssociations.addAll(listOf(*lambdaFunctionAssociations))
    }

    public fun lambdaFunctionAssociations(lambdaFunctionAssociations: Collection<Any>) {
        _lambdaFunctionAssociations.addAll(lambdaFunctionAssociations)
    }

    public fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations)
    }

    public fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
    }

    public fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
    }

    public fun originRequestPolicyId(originRequestPolicyId: String) {
        cdkBuilder.originRequestPolicyId(originRequestPolicyId)
    }

    public fun pathPattern(pathPattern: String) {
        cdkBuilder.pathPattern(pathPattern)
    }

    public fun realtimeLogConfigArn(realtimeLogConfigArn: String) {
        cdkBuilder.realtimeLogConfigArn(realtimeLogConfigArn)
    }

    public fun responseHeadersPolicyId(responseHeadersPolicyId: String) {
        cdkBuilder.responseHeadersPolicyId(responseHeadersPolicyId)
    }

    public fun smoothStreaming(smoothStreaming: Boolean) {
        cdkBuilder.smoothStreaming(smoothStreaming)
    }

    public fun smoothStreaming(smoothStreaming: IResolvable) {
        cdkBuilder.smoothStreaming(smoothStreaming)
    }

    public fun targetOriginId(targetOriginId: String) {
        cdkBuilder.targetOriginId(targetOriginId)
    }

    public fun trustedKeyGroups(vararg trustedKeyGroups: String) {
        _trustedKeyGroups.addAll(listOf(*trustedKeyGroups))
    }

    public fun trustedKeyGroups(trustedKeyGroups: Collection<String>) {
        _trustedKeyGroups.addAll(trustedKeyGroups)
    }

    public fun trustedSigners(vararg trustedSigners: String) {
        _trustedSigners.addAll(listOf(*trustedSigners))
    }

    public fun trustedSigners(trustedSigners: Collection<String>) {
        _trustedSigners.addAll(trustedSigners)
    }

    public fun viewerProtocolPolicy(viewerProtocolPolicy: String) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
    }

    public fun build(): CfnDistribution.CacheBehaviorProperty {
        if (_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
        if (_cachedMethods.isNotEmpty()) cdkBuilder.cachedMethods(_cachedMethods)
        if (_functionAssociations.isNotEmpty()) cdkBuilder.functionAssociations(_functionAssociations)
        if (_lambdaFunctionAssociations.isNotEmpty()) {
            cdkBuilder.lambdaFunctionAssociations(_lambdaFunctionAssociations)
        }
        if (_trustedKeyGroups.isNotEmpty()) cdkBuilder.trustedKeyGroups(_trustedKeyGroups)
        if (_trustedSigners.isNotEmpty()) cdkBuilder.trustedSigners(_trustedSigners)
        return cdkBuilder.build()
    }
}
