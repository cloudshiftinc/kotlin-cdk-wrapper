@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster
import software.amazon.awscdk.services.emr.CfnClusterProps

@CdkDslMarker
public class CfnClusterPropsDsl {
  private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

  private val _applications: MutableList<Any> = mutableListOf()

  private val _bootstrapActions: MutableList<Any> = mutableListOf()

  private val _configurations: MutableList<Any> = mutableListOf()

  private val _steps: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun additionalInfo(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.additionalInfo(builder.map)
  }

  public fun additionalInfo(additionalInfo: Any) {
    cdkBuilder.additionalInfo(additionalInfo)
  }

  public fun applications(vararg applications: Any) {
    _applications.addAll(listOf(*applications))
  }

  public fun applications(applications: Collection<Any>) {
    _applications.addAll(applications)
  }

  public fun applications(applications: IResolvable) {
    cdkBuilder.applications(applications)
  }

  public fun autoScalingRole(autoScalingRole: String) {
    cdkBuilder.autoScalingRole(autoScalingRole)
  }

  public fun autoTerminationPolicy(autoTerminationPolicy: IResolvable) {
    cdkBuilder.autoTerminationPolicy(autoTerminationPolicy)
  }

  public
      fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty) {
    cdkBuilder.autoTerminationPolicy(autoTerminationPolicy)
  }

  public fun bootstrapActions(vararg bootstrapActions: Any) {
    _bootstrapActions.addAll(listOf(*bootstrapActions))
  }

  public fun bootstrapActions(bootstrapActions: Collection<Any>) {
    _bootstrapActions.addAll(bootstrapActions)
  }

  public fun bootstrapActions(bootstrapActions: IResolvable) {
    cdkBuilder.bootstrapActions(bootstrapActions)
  }

  public fun configurations(vararg configurations: Any) {
    _configurations.addAll(listOf(*configurations))
  }

  public fun configurations(configurations: Collection<Any>) {
    _configurations.addAll(configurations)
  }

  public fun configurations(configurations: IResolvable) {
    cdkBuilder.configurations(configurations)
  }

  public fun customAmiId(customAmiId: String) {
    cdkBuilder.customAmiId(customAmiId)
  }

  public fun ebsRootVolumeSize(ebsRootVolumeSize: Number) {
    cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize)
  }

  public fun instances(instances: IResolvable) {
    cdkBuilder.instances(instances)
  }

  public fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty) {
    cdkBuilder.instances(instances)
  }

  public fun jobFlowRole(jobFlowRole: String) {
    cdkBuilder.jobFlowRole(jobFlowRole)
  }

  public fun kerberosAttributes(kerberosAttributes: IResolvable) {
    cdkBuilder.kerberosAttributes(kerberosAttributes)
  }

  public fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty) {
    cdkBuilder.kerberosAttributes(kerberosAttributes)
  }

  public fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String) {
    cdkBuilder.logEncryptionKmsKeyId(logEncryptionKmsKeyId)
  }

  public fun logUri(logUri: String) {
    cdkBuilder.logUri(logUri)
  }

  public fun managedScalingPolicy(managedScalingPolicy: IResolvable) {
    cdkBuilder.managedScalingPolicy(managedScalingPolicy)
  }

  public fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty) {
    cdkBuilder.managedScalingPolicy(managedScalingPolicy)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun osReleaseLabel(osReleaseLabel: String) {
    cdkBuilder.osReleaseLabel(osReleaseLabel)
  }

  public fun releaseLabel(releaseLabel: String) {
    cdkBuilder.releaseLabel(releaseLabel)
  }

  public fun scaleDownBehavior(scaleDownBehavior: String) {
    cdkBuilder.scaleDownBehavior(scaleDownBehavior)
  }

  public fun securityConfiguration(securityConfiguration: String) {
    cdkBuilder.securityConfiguration(securityConfiguration)
  }

  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
    cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
  }

  public fun steps(vararg steps: Any) {
    _steps.addAll(listOf(*steps))
  }

  public fun steps(steps: Collection<Any>) {
    _steps.addAll(steps)
  }

  public fun steps(steps: IResolvable) {
    cdkBuilder.steps(steps)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun visibleToAllUsers(visibleToAllUsers: Boolean) {
    cdkBuilder.visibleToAllUsers(visibleToAllUsers)
  }

  public fun visibleToAllUsers(visibleToAllUsers: IResolvable) {
    cdkBuilder.visibleToAllUsers(visibleToAllUsers)
  }

  public fun build(): CfnClusterProps {
    if(_applications.isNotEmpty()) cdkBuilder.applications(_applications)
    if(_bootstrapActions.isNotEmpty()) cdkBuilder.bootstrapActions(_bootstrapActions)
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    if(_steps.isNotEmpty()) cdkBuilder.steps(_steps)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
