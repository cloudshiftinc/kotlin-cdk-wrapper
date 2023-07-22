@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnStep

/**
 * A specification of the number and type of Amazon EC2 instances.
 */
public inline
    fun CfnCluster.setInstances(block: CfnClusterJobFlowInstancesConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterJobFlowInstancesConfigPropertyDsl()
  builder.apply(block)
  return setInstances(builder.build())
}

/**
 *
 */
public inline
    fun CfnCluster.setAutoTerminationPolicy(block: CfnClusterAutoTerminationPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterAutoTerminationPolicyPropertyDsl()
  builder.apply(block)
  return setAutoTerminationPolicy(builder.build())
}

/**
 * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
 * configuration.
 */
public inline
    fun CfnCluster.setKerberosAttributes(block: CfnClusterKerberosAttributesPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterKerberosAttributesPropertyDsl()
  builder.apply(block)
  return setKerberosAttributes(builder.build())
}

/**
 * Creates or updates a managed scaling policy for an Amazon EMR cluster.
 */
public inline
    fun CfnCluster.setManagedScalingPolicy(block: CfnClusterManagedScalingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterManagedScalingPolicyPropertyDsl()
  builder.apply(block)
  return setManagedScalingPolicy(builder.build())
}

/**
 * The launch specification for the instance fleet.
 */
public inline
    fun CfnInstanceFleetConfig.setLaunchSpecifications(block: CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl()
  builder.apply(block)
  return setLaunchSpecifications(builder.build())
}

/**
 * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file whose
 * main function will be executed.
 */
public inline fun CfnStep.setHadoopJarStep(block: CfnStepHadoopJarStepConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnStepHadoopJarStepConfigPropertyDsl()
  builder.apply(block)
  return setHadoopJarStep(builder.build())
}

/**
 * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
 */
public inline
    fun CfnInstanceGroupConfig.setAutoScalingPolicy(block: CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl()
  builder.apply(block)
  return setAutoScalingPolicy(builder.build())
}

/**
 * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
 */
public inline
    fun CfnInstanceGroupConfig.setEbsConfiguration(block: CfnInstanceGroupConfigEbsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceGroupConfigEbsConfigurationPropertyDsl()
  builder.apply(block)
  return setEbsConfiguration(builder.build())
}
