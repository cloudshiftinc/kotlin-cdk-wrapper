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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.efs.FileSystemProps
import software.amazon.awscdk.services.efs.LifecyclePolicy
import software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy
import software.amazon.awscdk.services.efs.PerformanceMode
import software.amazon.awscdk.services.efs.ThroughputMode
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class FileSystemPropsDsl {
    private val cdkBuilder: FileSystemProps.Builder = FileSystemProps.builder()

    public fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
        cdkBuilder.enableAutomaticBackups(enableAutomaticBackups)
    }

    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun fileSystemName(fileSystemName: String) {
        cdkBuilder.fileSystemName(fileSystemName)
    }

    public fun fileSystemPolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(block)
        cdkBuilder.fileSystemPolicy(builder.build())
    }

    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
        cdkBuilder.fileSystemPolicy(fileSystemPolicy)
    }

    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    public fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy) {
        cdkBuilder.outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy)
    }

    public fun performanceMode(performanceMode: PerformanceMode) {
        cdkBuilder.performanceMode(performanceMode)
    }

    public fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
        cdkBuilder.provisionedThroughputPerSecond(provisionedThroughputPerSecond)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun throughputMode(throughputMode: ThroughputMode) {
        cdkBuilder.throughputMode(throughputMode)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): FileSystemProps = cdkBuilder.build()
}
