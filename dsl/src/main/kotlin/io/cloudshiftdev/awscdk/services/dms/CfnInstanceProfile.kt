package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrInstanceProfileArn(): String = unwrap(this).getAttrInstanceProfileArn()

  public open fun attrInstanceProfileCreationTime(): String =
      unwrap(this).getAttrInstanceProfileCreationTime()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

  public open fun instanceProfileIdentifier(`value`: String) {
    unwrap(this).setInstanceProfileIdentifier(`value`)
  }

  public open fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  public open fun instanceProfileName(`value`: String) {
    unwrap(this).setInstanceProfileName(`value`)
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun networkType(): String? = unwrap(this).getNetworkType()

  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun subnetGroupIdentifier(): String? = unwrap(this).getSubnetGroupIdentifier()

  public open fun subnetGroupIdentifier(`value`: String) {
    unwrap(this).setSubnetGroupIdentifier(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?:
      emptyList()

  public open fun vpcSecurityGroups(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroups(`value`)
  }

  public open fun vpcSecurityGroups(vararg `value`: String): Unit =
      vpcSecurityGroups(`value`.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnInstanceProfile.Builder =
        software.amazon.awscdk.services.dms.CfnInstanceProfile.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.dms.CfnInstanceProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfile):
        CfnInstanceProfile = CfnInstanceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfile):
        software.amazon.awscdk.services.dms.CfnInstanceProfile = wrapped.cdkObject
  }
}
