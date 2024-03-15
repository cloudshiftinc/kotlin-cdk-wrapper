@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * Instance type for EC2 instances.
 *
 * This class takes a literal string, good if you already
 * know the identifier of the type you want.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .masterUser(Login.builder()
 * .username("myuser")
 * .build())
 * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .vpc(vpc)
 * .removalPolicy(RemovalPolicy.SNAPSHOT)
 * .instanceRemovalPolicy(RemovalPolicy.RETAIN)
 * .build();
 * ```
 */
public open class InstanceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InstanceType,
) : CdkObject(cdkObject) {
  public constructor(instanceTypeIdentifier: String) :
      this(software.amazon.awscdk.services.ec2.InstanceType(instanceTypeIdentifier)
  )

  /**
   * The instance's CPU architecture.
   */
  public open fun architecture(): InstanceArchitecture =
      unwrap(this).getArchitecture().let(InstanceArchitecture::wrap)

  /**
   * Return whether this instance type is a burstable instance type.
   */
  public open fun isBurstable(): Boolean = unwrap(this).isBurstable()

  /**
   * @param other 
   */
  public open fun sameInstanceClassAs(other: InstanceType): Boolean =
      unwrap(this).sameInstanceClassAs(other.let(InstanceType::unwrap))

  public companion object {
    public fun of(instanceClass: InstanceClass, instanceSize: InstanceSize): InstanceType =
        software.amazon.awscdk.services.ec2.InstanceType.of(instanceClass.let(InstanceClass::unwrap),
        instanceSize.let(InstanceSize::unwrap)).let(InstanceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceType): InstanceType =
        InstanceType(cdkObject)

    internal fun unwrap(wrapped: InstanceType): software.amazon.awscdk.services.ec2.InstanceType =
        wrapped.cdkObject
  }
}
