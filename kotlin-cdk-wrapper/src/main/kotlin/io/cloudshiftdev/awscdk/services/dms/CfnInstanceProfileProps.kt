@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInstanceProfileProps {
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun networkType(): String? = unwrap(this).getNetworkType()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun subnetGroupIdentifier(): String? = unwrap(this).getSubnetGroupIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun description(description: String)

    public fun instanceProfileIdentifier(instanceProfileIdentifier: String)

    public fun instanceProfileName(instanceProfileName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun networkType(networkType: String)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun subnetGroupIdentifier(subnetGroupIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcSecurityGroups(vpcSecurityGroups: List<String>)

    public fun vpcSecurityGroups(vararg vpcSecurityGroups: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnInstanceProfileProps.Builder =
        software.amazon.awscdk.services.dms.CfnInstanceProfileProps.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
      cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
    }

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun subnetGroupIdentifier(subnetGroupIdentifier: String) {
      cdkBuilder.subnetGroupIdentifier(subnetGroupIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcSecurityGroups(vpcSecurityGroups: List<String>) {
      cdkBuilder.vpcSecurityGroups(vpcSecurityGroups)
    }

    override fun vpcSecurityGroups(vararg vpcSecurityGroups: String): Unit =
        vpcSecurityGroups(vpcSecurityGroups.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnInstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfileProps,
  ) : CdkObject(cdkObject), CfnInstanceProfileProps {
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun networkType(): String? = unwrap(this).getNetworkType()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun subnetGroupIdentifier(): String? = unwrap(this).getSubnetGroupIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfileProps):
        CfnInstanceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfileProps):
        software.amazon.awscdk.services.dms.CfnInstanceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnInstanceProfileProps
  }
}
