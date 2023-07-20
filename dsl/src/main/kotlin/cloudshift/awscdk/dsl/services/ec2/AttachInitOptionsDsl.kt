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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.services.ec2.AttachInitOptions
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AttachInitOptionsDsl {
    private val cdkBuilder: AttachInitOptions.Builder = AttachInitOptions.builder()

    private val _configSets: MutableList<String> = mutableListOf()

    public fun configSets(vararg configSets: String) {
        _configSets.addAll(listOf(*configSets))
    }

    public fun configSets(configSets: Collection<String>) {
        _configSets.addAll(configSets)
    }

    public fun embedFingerprint(embedFingerprint: Boolean) {
        cdkBuilder.embedFingerprint(embedFingerprint)
    }

    public fun ignoreFailures(ignoreFailures: Boolean) {
        cdkBuilder.ignoreFailures(ignoreFailures)
    }

    public fun includeRole(includeRole: Boolean) {
        cdkBuilder.includeRole(includeRole)
    }

    public fun includeUrl(includeUrl: Boolean) {
        cdkBuilder.includeUrl(includeUrl)
    }

    public fun instanceRole(instanceRole: IRole) {
        cdkBuilder.instanceRole(instanceRole)
    }

    public fun platform(platform: OperatingSystemType) {
        cdkBuilder.platform(platform)
    }

    public fun printLog(printLog: Boolean) {
        cdkBuilder.printLog(printLog)
    }

    public fun signalResource(signalResource: CfnResource) {
        cdkBuilder.signalResource(signalResource)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AttachInitOptions {
        if (_configSets.isNotEmpty()) cdkBuilder.configSets(_configSets)
        return cdkBuilder.build()
    }
}
