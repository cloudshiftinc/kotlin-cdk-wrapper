@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAMPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addressFamily(): String = unwrap(this).getAddressFamily()

  public open fun addressFamily(`value`: String) {
    unwrap(this).setAddressFamily(`value`)
  }

  public open fun allocationDefaultNetmaskLength(): Number? =
      unwrap(this).getAllocationDefaultNetmaskLength()

  public open fun allocationDefaultNetmaskLength(`value`: Number) {
    unwrap(this).setAllocationDefaultNetmaskLength(`value`)
  }

  public open fun allocationMaxNetmaskLength(): Number? =
      unwrap(this).getAllocationMaxNetmaskLength()

  public open fun allocationMaxNetmaskLength(`value`: Number) {
    unwrap(this).setAllocationMaxNetmaskLength(`value`)
  }

  public open fun allocationMinNetmaskLength(): Number? =
      unwrap(this).getAllocationMinNetmaskLength()

  public open fun allocationMinNetmaskLength(`value`: Number) {
    unwrap(this).setAllocationMinNetmaskLength(`value`)
  }

  public open fun allocationResourceTags(): Any? = unwrap(this).getAllocationResourceTags()

  public open fun allocationResourceTags(`value`: IResolvable) {
    unwrap(this).setAllocationResourceTags(`value`.let(IResolvable::unwrap))
  }

  public open fun allocationResourceTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setAllocationResourceTags(__idx_ac66f0)
  }

  public open fun allocationResourceTags(vararg __idx_ac66f0: Any): Unit =
      allocationResourceTags(__idx_ac66f0.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrIpamArn(): String = unwrap(this).getAttrIpamArn()

  public open fun attrIpamPoolId(): String = unwrap(this).getAttrIpamPoolId()

  public open fun attrIpamScopeArn(): String = unwrap(this).getAttrIpamScopeArn()

  public open fun attrIpamScopeType(): String = unwrap(this).getAttrIpamScopeType()

  public open fun attrPoolDepth(): Number = unwrap(this).getAttrPoolDepth()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrStateMessage(): String = unwrap(this).getAttrStateMessage()

  public open fun autoImport(): Any? = unwrap(this).getAutoImport()

  public open fun autoImport(`value`: Boolean) {
    unwrap(this).setAutoImport(`value`)
  }

  public open fun autoImport(`value`: IResolvable) {
    unwrap(this).setAutoImport(`value`.let(IResolvable::unwrap))
  }

  public open fun awsService(): String? = unwrap(this).getAwsService()

  public open fun awsService(`value`: String) {
    unwrap(this).setAwsService(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipamScopeId(): String = unwrap(this).getIpamScopeId()

  public open fun ipamScopeId(`value`: String) {
    unwrap(this).setIpamScopeId(`value`)
  }

  public open fun locale(): String? = unwrap(this).getLocale()

  public open fun locale(`value`: String) {
    unwrap(this).setLocale(`value`)
  }

  public open fun provisionedCidrs(): Any? = unwrap(this).getProvisionedCidrs()

  public open fun provisionedCidrs(`value`: IResolvable) {
    unwrap(this).setProvisionedCidrs(`value`.let(IResolvable::unwrap))
  }

  public open fun provisionedCidrs(__idx_ac66f0: List<Any>) {
    unwrap(this).setProvisionedCidrs(__idx_ac66f0)
  }

  public open fun provisionedCidrs(vararg __idx_ac66f0: Any): Unit =
      provisionedCidrs(__idx_ac66f0.toList())

  public open fun publicIpSource(): String? = unwrap(this).getPublicIpSource()

  public open fun publicIpSource(`value`: String) {
    unwrap(this).setPublicIpSource(`value`)
  }

  public open fun publiclyAdvertisable(): Any? = unwrap(this).getPubliclyAdvertisable()

  public open fun publiclyAdvertisable(`value`: Boolean) {
    unwrap(this).setPubliclyAdvertisable(`value`)
  }

  public open fun publiclyAdvertisable(`value`: IResolvable) {
    unwrap(this).setPubliclyAdvertisable(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceIpamPoolId(): String? = unwrap(this).getSourceIpamPoolId()

  public open fun sourceIpamPoolId(`value`: String) {
    unwrap(this).setSourceIpamPoolId(`value`)
  }

  public open fun sourceResource(): Any? = unwrap(this).getSourceResource()

  public open fun sourceResource(`value`: IResolvable) {
    unwrap(this).setSourceResource(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceResource(`value`: SourceResourceProperty) {
    unwrap(this).setSourceResource(`value`.let(SourceResourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1f78231e46e0069c652a03fe2036b256d93cdaac995dc88a3bef085e9ceb678")
  public open fun sourceResource(`value`: SourceResourceProperty.Builder.() -> Unit): Unit =
      sourceResource(SourceResourceProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun addressFamily(addressFamily: String)

    public fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number)

    public fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number)

    public fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number)

    public fun allocationResourceTags(allocationResourceTags: IResolvable)

    public fun allocationResourceTags(allocationResourceTags: List<Any>)

    public fun allocationResourceTags(vararg allocationResourceTags: Any)

    public fun autoImport(autoImport: Boolean)

    public fun autoImport(autoImport: IResolvable)

    public fun awsService(awsService: String)

    public fun description(description: String)

    public fun ipamScopeId(ipamScopeId: String)

    public fun locale(locale: String)

    public fun provisionedCidrs(provisionedCidrs: IResolvable)

    public fun provisionedCidrs(provisionedCidrs: List<Any>)

    public fun provisionedCidrs(vararg provisionedCidrs: Any)

    public fun publicIpSource(publicIpSource: String)

    public fun publiclyAdvertisable(publiclyAdvertisable: Boolean)

    public fun publiclyAdvertisable(publiclyAdvertisable: IResolvable)

    public fun sourceIpamPoolId(sourceIpamPoolId: String)

    public fun sourceResource(sourceResource: IResolvable)

    public fun sourceResource(sourceResource: SourceResourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef83e558225eb21dddf1d39328df53c2bd0b498f2d5a26d4bc20ea20a24682a6")
    public fun sourceResource(sourceResource: SourceResourceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPool.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPool.Builder.create(scope, id)

    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    override fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number) {
      cdkBuilder.allocationDefaultNetmaskLength(allocationDefaultNetmaskLength)
    }

    override fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number) {
      cdkBuilder.allocationMaxNetmaskLength(allocationMaxNetmaskLength)
    }

    override fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number) {
      cdkBuilder.allocationMinNetmaskLength(allocationMinNetmaskLength)
    }

    override fun allocationResourceTags(allocationResourceTags: IResolvable) {
      cdkBuilder.allocationResourceTags(allocationResourceTags.let(IResolvable::unwrap))
    }

    override fun allocationResourceTags(allocationResourceTags: List<Any>) {
      cdkBuilder.allocationResourceTags(allocationResourceTags)
    }

    override fun allocationResourceTags(vararg allocationResourceTags: Any): Unit =
        allocationResourceTags(allocationResourceTags.toList())

    override fun autoImport(autoImport: Boolean) {
      cdkBuilder.autoImport(autoImport)
    }

    override fun autoImport(autoImport: IResolvable) {
      cdkBuilder.autoImport(autoImport.let(IResolvable::unwrap))
    }

    override fun awsService(awsService: String) {
      cdkBuilder.awsService(awsService)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ipamScopeId(ipamScopeId: String) {
      cdkBuilder.ipamScopeId(ipamScopeId)
    }

    override fun locale(locale: String) {
      cdkBuilder.locale(locale)
    }

    override fun provisionedCidrs(provisionedCidrs: IResolvable) {
      cdkBuilder.provisionedCidrs(provisionedCidrs.let(IResolvable::unwrap))
    }

    override fun provisionedCidrs(provisionedCidrs: List<Any>) {
      cdkBuilder.provisionedCidrs(provisionedCidrs)
    }

    override fun provisionedCidrs(vararg provisionedCidrs: Any): Unit =
        provisionedCidrs(provisionedCidrs.toList())

    override fun publicIpSource(publicIpSource: String) {
      cdkBuilder.publicIpSource(publicIpSource)
    }

    override fun publiclyAdvertisable(publiclyAdvertisable: Boolean) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
    }

    override fun publiclyAdvertisable(publiclyAdvertisable: IResolvable) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable.let(IResolvable::unwrap))
    }

    override fun sourceIpamPoolId(sourceIpamPoolId: String) {
      cdkBuilder.sourceIpamPoolId(sourceIpamPoolId)
    }

    override fun sourceResource(sourceResource: IResolvable) {
      cdkBuilder.sourceResource(sourceResource.let(IResolvable::unwrap))
    }

    override fun sourceResource(sourceResource: SourceResourceProperty) {
      cdkBuilder.sourceResource(sourceResource.let(SourceResourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef83e558225eb21dddf1d39328df53c2bd0b498f2d5a26d4bc20ea20a24682a6")
    override fun sourceResource(sourceResource: SourceResourceProperty.Builder.() -> Unit): Unit =
        sourceResource(SourceResourceProperty(sourceResource))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPool = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnIPAMPool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool): CfnIPAMPool =
        CfnIPAMPool(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPool): software.amazon.awscdk.services.ec2.CfnIPAMPool =
        wrapped.cdkObject
  }

  public interface ProvisionedCidrProperty {
    public fun cidr(): String

    @CdkDslMarker
    public interface Builder {
      public fun cidr(cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty.builder()

      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty,
    ) : CdkObject(cdkObject), ProvisionedCidrProperty {
      override fun cidr(): String = unwrap(this).getCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedCidrProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty):
          ProvisionedCidrProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedCidrProperty):
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty
    }
  }

  public interface SourceResourceProperty {
    public fun resourceId(): String

    public fun resourceOwner(): String

    public fun resourceRegion(): String

    public fun resourceType(): String

    @CdkDslMarker
    public interface Builder {
      public fun resourceId(resourceId: String)

      public fun resourceOwner(resourceOwner: String)

      public fun resourceRegion(resourceRegion: String)

      public fun resourceType(resourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty.builder()

      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      override fun resourceOwner(resourceOwner: String) {
        cdkBuilder.resourceOwner(resourceOwner)
      }

      override fun resourceRegion(resourceRegion: String) {
        cdkBuilder.resourceRegion(resourceRegion)
      }

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty,
    ) : CdkObject(cdkObject), SourceResourceProperty {
      override fun resourceId(): String = unwrap(this).getResourceId()

      override fun resourceOwner(): String = unwrap(this).getResourceOwner()

      override fun resourceRegion(): String = unwrap(this).getResourceRegion()

      override fun resourceType(): String = unwrap(this).getResourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty):
          SourceResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceResourceProperty):
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty
    }
  }
}
