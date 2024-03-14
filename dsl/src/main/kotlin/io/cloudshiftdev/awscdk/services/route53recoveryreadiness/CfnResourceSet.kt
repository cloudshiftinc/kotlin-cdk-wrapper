package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrResourceSetArn(): String = unwrap(this).getAttrResourceSetArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  public open fun resourceSetName(`value`: String) {
    unwrap(this).setResourceSetName(`value`)
  }

  public open fun resourceSetType(): String = unwrap(this).getResourceSetType()

  public open fun resourceSetType(`value`: String) {
    unwrap(this).setResourceSetType(`value`)
  }

  public open fun resources(): Any = unwrap(this).getResources()

  public open fun resources(`value`: IResolvable) {
    unwrap(this).setResources(`value`.let(IResolvable::unwrap))
  }

  public open fun resources(__idx_ac66f0: List<Any>) {
    unwrap(this).setResources(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun resourceSetName(resourceSetName: String) {
    }

    public fun resourceSetType(resourceSetType: String) {
    }

    public fun resources(resources: IResolvable) {
    }

    public fun resources(resources: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.Builder.create(scope,
        id)

    public override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    public override fun resourceSetType(resourceSetType: String) {
      cdkBuilder.resourceSetType(resourceSetType)
    }

    public override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable::unwrap))
    }

    public override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceSet(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet):
        CfnResourceSet = CfnResourceSet(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSet):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet = wrapped.cdkObject
  }

  public interface TargetResourceProperty {
    public fun nlbResource(): Any? = unwrap(this).getNlbResource()

    public fun r53Resource(): Any? = unwrap(this).getR53Resource()

    public interface Builder {
      public fun nlbResource(nlbResource: IResolvable) {
      }

      public fun nlbResource(nlbResource: NLBResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("001848c7e336aaea9381dbaf6bca573a846b4eeff24e5df9008313c8fc40c4e4")
      public fun nlbResource(nlbResource: NLBResourceProperty.Builder.() -> Unit) {
      }

      public fun r53Resource(r53Resource: IResolvable) {
      }

      public fun r53Resource(r53Resource: R53ResourceRecordProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12521b6ef63fdb393ae03d277f774d30d5112e6c8ff55fb1186767ea126bc8a3")
      public fun r53Resource(r53Resource: R53ResourceRecordProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty.builder()

      public override fun nlbResource(nlbResource: IResolvable) {
        cdkBuilder.nlbResource(nlbResource.let(IResolvable::unwrap))
      }

      public override fun nlbResource(nlbResource: NLBResourceProperty) {
        cdkBuilder.nlbResource(nlbResource.let(NLBResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("001848c7e336aaea9381dbaf6bca573a846b4eeff24e5df9008313c8fc40c4e4")
      public override fun nlbResource(nlbResource: NLBResourceProperty.Builder.() -> Unit): Unit =
          nlbResource(NLBResourceProperty(nlbResource))

      public override fun r53Resource(r53Resource: IResolvable) {
        cdkBuilder.r53Resource(r53Resource.let(IResolvable::unwrap))
      }

      public override fun r53Resource(r53Resource: R53ResourceRecordProperty) {
        cdkBuilder.r53Resource(r53Resource.let(R53ResourceRecordProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12521b6ef63fdb393ae03d277f774d30d5112e6c8ff55fb1186767ea126bc8a3")
      public override fun r53Resource(r53Resource: R53ResourceRecordProperty.Builder.() -> Unit):
          Unit = r53Resource(R53ResourceRecordProperty(r53Resource))

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty,
    ) : TargetResourceProperty {
      public override fun nlbResource(): Any? = unwrap(this).getNlbResource()

      public override fun r53Resource(): Any? = unwrap(this).getR53Resource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty):
          TargetResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NLBResourceProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public interface Builder {
      public fun arn(arn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty,
    ) : NLBResourceProperty {
      public override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NLBResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty):
          NLBResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NLBResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface R53ResourceRecordProperty {
    public fun domainName(): String? = unwrap(this).getDomainName()

    public fun recordSetId(): String? = unwrap(this).getRecordSetId()

    public interface Builder {
      public fun domainName(domainName: String) {
      }

      public fun recordSetId(recordSetId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty.builder()

      public override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      public override fun recordSetId(recordSetId: String) {
        cdkBuilder.recordSetId(recordSetId)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty,
    ) : R53ResourceRecordProperty {
      public override fun domainName(): String? = unwrap(this).getDomainName()

      public override fun recordSetId(): String? = unwrap(this).getRecordSetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): R53ResourceRecordProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty):
          R53ResourceRecordProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: R53ResourceRecordProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceProperty {
    public fun componentId(): String? = unwrap(this).getComponentId()

    public fun dnsTargetResource(): Any? = unwrap(this).getDnsTargetResource()

    public fun readinessScopes(): List<String> = unwrap(this).getReadinessScopes() ?: emptyList()

    public fun resourceArn(): String? = unwrap(this).getResourceArn()

    public interface Builder {
      public fun componentId(componentId: String) {
      }

      public fun dnsTargetResource(dnsTargetResource: IResolvable) {
      }

      public fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83baffb106efe707b424ff93ce00925d442bb572f3758234141759a3330018c1")
      public
          fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty.Builder.() -> Unit) {
      }

      public fun readinessScopes(readinessScopes: List<String>) {
      }

      public fun resourceArn(resourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty.builder()

      public override fun componentId(componentId: String) {
        cdkBuilder.componentId(componentId)
      }

      public override fun dnsTargetResource(dnsTargetResource: IResolvable) {
        cdkBuilder.dnsTargetResource(dnsTargetResource.let(IResolvable::unwrap))
      }

      public override fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty) {
        cdkBuilder.dnsTargetResource(dnsTargetResource.let(DNSTargetResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83baffb106efe707b424ff93ce00925d442bb572f3758234141759a3330018c1")
      public override
          fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty.Builder.() -> Unit):
          Unit = dnsTargetResource(DNSTargetResourceProperty(dnsTargetResource))

      public override fun readinessScopes(readinessScopes: List<String>) {
        cdkBuilder.readinessScopes(readinessScopes)
      }

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty,
    ) : ResourceProperty {
      public override fun componentId(): String? = unwrap(this).getComponentId()

      public override fun dnsTargetResource(): Any? = unwrap(this).getDnsTargetResource()

      public override fun readinessScopes(): List<String> = unwrap(this).getReadinessScopes() ?:
          emptyList()

      public override fun resourceArn(): String? = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty):
          ResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DNSTargetResourceProperty {
    public fun domainName(): String? = unwrap(this).getDomainName()

    public fun hostedZoneArn(): String? = unwrap(this).getHostedZoneArn()

    public fun recordSetId(): String? = unwrap(this).getRecordSetId()

    public fun recordType(): String? = unwrap(this).getRecordType()

    public fun targetResource(): Any? = unwrap(this).getTargetResource()

    public interface Builder {
      public fun domainName(domainName: String) {
      }

      public fun hostedZoneArn(hostedZoneArn: String) {
      }

      public fun recordSetId(recordSetId: String) {
      }

      public fun recordType(recordType: String) {
      }

      public fun targetResource(targetResource: IResolvable) {
      }

      public fun targetResource(targetResource: TargetResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe4c3c3501872a36e8971e95e7186cfe0741261c4a3201f6c88516a9b257376")
      public fun targetResource(targetResource: TargetResourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty.builder()

      public override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      public override fun hostedZoneArn(hostedZoneArn: String) {
        cdkBuilder.hostedZoneArn(hostedZoneArn)
      }

      public override fun recordSetId(recordSetId: String) {
        cdkBuilder.recordSetId(recordSetId)
      }

      public override fun recordType(recordType: String) {
        cdkBuilder.recordType(recordType)
      }

      public override fun targetResource(targetResource: IResolvable) {
        cdkBuilder.targetResource(targetResource.let(IResolvable::unwrap))
      }

      public override fun targetResource(targetResource: TargetResourceProperty) {
        cdkBuilder.targetResource(targetResource.let(TargetResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe4c3c3501872a36e8971e95e7186cfe0741261c4a3201f6c88516a9b257376")
      public override fun targetResource(targetResource: TargetResourceProperty.Builder.() -> Unit):
          Unit = targetResource(TargetResourceProperty(targetResource))

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty,
    ) : DNSTargetResourceProperty {
      public override fun domainName(): String? = unwrap(this).getDomainName()

      public override fun hostedZoneArn(): String? = unwrap(this).getHostedZoneArn()

      public override fun recordSetId(): String? = unwrap(this).getRecordSetId()

      public override fun recordType(): String? = unwrap(this).getRecordType()

      public override fun targetResource(): Any? = unwrap(this).getTargetResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DNSTargetResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty):
          DNSTargetResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DNSTargetResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
