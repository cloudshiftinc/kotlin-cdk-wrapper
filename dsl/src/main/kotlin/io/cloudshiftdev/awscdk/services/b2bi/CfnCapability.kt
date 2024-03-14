package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnCapability internal constructor(
  private val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCapabilityArn(): String = unwrap(this).getAttrCapabilityArn()

  public open fun attrCapabilityId(): String = unwrap(this).getAttrCapabilityId()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun configuration(): Any = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: CapabilityConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(CapabilityConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4a5807f71764d3387a6a1c9b4c5f682b57c11e7981b22c92c1103958c6d99c9")
  public open fun configuration(`value`: CapabilityConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(CapabilityConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instructionsDocuments(): Any? = unwrap(this).getInstructionsDocuments()

  public open fun instructionsDocuments(`value`: IResolvable) {
    unwrap(this).setInstructionsDocuments(`value`.let(IResolvable::unwrap))
  }

  public open fun instructionsDocuments(__idx_ac66f0: List<Any>) {
    unwrap(this).setInstructionsDocuments(__idx_ac66f0)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun configuration(configuration: IResolvable) {
    }

    public fun configuration(configuration: CapabilityConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c3559d53849f639cc9f05cf1c37555296d5a8cb869318f56e0676c5c793f81")
    public fun configuration(configuration: CapabilityConfigurationProperty.Builder.() -> Unit) {
    }

    public fun instructionsDocuments(instructionsDocuments: IResolvable) {
    }

    public fun instructionsDocuments(instructionsDocuments: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnCapability.Builder =
        software.amazon.awscdk.services.b2bi.CfnCapability.Builder.create(scope, id)

    public override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    public override fun configuration(configuration: CapabilityConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CapabilityConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c3559d53849f639cc9f05cf1c37555296d5a8cb869318f56e0676c5c793f81")
    public override
        fun configuration(configuration: CapabilityConfigurationProperty.Builder.() -> Unit): Unit =
        configuration(CapabilityConfigurationProperty(configuration))

    public override fun instructionsDocuments(instructionsDocuments: IResolvable) {
      cdkBuilder.instructionsDocuments(instructionsDocuments.let(IResolvable::unwrap))
    }

    public override fun instructionsDocuments(instructionsDocuments: List<Any>) {
      cdkBuilder.instructionsDocuments(instructionsDocuments)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapability {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapability(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability): CfnCapability
        = CfnCapability(cdkObject)

    internal fun unwrap(wrapped: CfnCapability): software.amazon.awscdk.services.b2bi.CfnCapability
        = wrapped.cdkObject
  }

  public interface CapabilityConfigurationProperty {
    public fun edi(): Any

    public interface Builder {
      public fun edi(edi: IResolvable) {
      }

      public fun edi(edi: EdiConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d8f4fe2c5f0410e138a92ce9520289809defd53587b984a78e7511307ad324")
      public fun edi(edi: EdiConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty.builder()

      public override fun edi(edi: IResolvable) {
        cdkBuilder.edi(edi.let(IResolvable::unwrap))
      }

      public override fun edi(edi: EdiConfigurationProperty) {
        cdkBuilder.edi(edi.let(EdiConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d8f4fe2c5f0410e138a92ce9520289809defd53587b984a78e7511307ad324")
      public override fun edi(edi: EdiConfigurationProperty.Builder.() -> Unit): Unit =
          edi(EdiConfigurationProperty(edi))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty,
    ) : CapabilityConfigurationProperty {
      public override fun edi(): Any = unwrap(this).getEdi()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CapabilityConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty):
          CapabilityConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapabilityConfigurationProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface X12DetailsProperty {
    public fun transactionSet(): String? = unwrap(this).getTransactionSet()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun transactionSet(transactionSet: String) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty.builder()

      public override fun transactionSet(transactionSet: String) {
        cdkBuilder.transactionSet(transactionSet)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty,
    ) : X12DetailsProperty {
      public override fun transactionSet(): String? = unwrap(this).getTransactionSet()

      public override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): X12DetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty):
          X12DetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12DetailsProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EdiConfigurationProperty {
    public fun inputLocation(): Any

    public fun outputLocation(): Any

    public fun transformerId(): String

    public fun type(): Any

    public interface Builder {
      public fun inputLocation(inputLocation: IResolvable) {
      }

      public fun inputLocation(inputLocation: S3LocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9711a48fef29876bea8efa2203e11c23bfeee8eaf7ef107551b482f7c094b3a6")
      public fun inputLocation(inputLocation: S3LocationProperty.Builder.() -> Unit) {
      }

      public fun outputLocation(outputLocation: IResolvable) {
      }

      public fun outputLocation(outputLocation: S3LocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c322b01a9a16e6080ed97f50aa47e91385bea666c445f1d73e82bfbc616a364d")
      public fun outputLocation(outputLocation: S3LocationProperty.Builder.() -> Unit) {
      }

      public fun transformerId(transformerId: String) {
      }

      public fun type(type: IResolvable) {
      }

      public fun type(type: EdiTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16fb75b5b13232d13ec3662e92ea290c48516c04a866312d107eb1e18c51c0b4")
      public fun type(type: EdiTypeProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty.builder()

      public override fun inputLocation(inputLocation: IResolvable) {
        cdkBuilder.inputLocation(inputLocation.let(IResolvable::unwrap))
      }

      public override fun inputLocation(inputLocation: S3LocationProperty) {
        cdkBuilder.inputLocation(inputLocation.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9711a48fef29876bea8efa2203e11c23bfeee8eaf7ef107551b482f7c094b3a6")
      public override fun inputLocation(inputLocation: S3LocationProperty.Builder.() -> Unit): Unit
          = inputLocation(S3LocationProperty(inputLocation))

      public override fun outputLocation(outputLocation: IResolvable) {
        cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
      }

      public override fun outputLocation(outputLocation: S3LocationProperty) {
        cdkBuilder.outputLocation(outputLocation.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c322b01a9a16e6080ed97f50aa47e91385bea666c445f1d73e82bfbc616a364d")
      public override fun outputLocation(outputLocation: S3LocationProperty.Builder.() -> Unit):
          Unit = outputLocation(S3LocationProperty(outputLocation))

      public override fun transformerId(transformerId: String) {
        cdkBuilder.transformerId(transformerId)
      }

      public override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable::unwrap))
      }

      public override fun type(type: EdiTypeProperty) {
        cdkBuilder.type(type.let(EdiTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16fb75b5b13232d13ec3662e92ea290c48516c04a866312d107eb1e18c51c0b4")
      public override fun type(type: EdiTypeProperty.Builder.() -> Unit): Unit =
          type(EdiTypeProperty(type))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty,
    ) : EdiConfigurationProperty {
      public override fun inputLocation(): Any = unwrap(this).getInputLocation()

      public override fun outputLocation(): Any = unwrap(this).getOutputLocation()

      public override fun transformerId(): String = unwrap(this).getTransformerId()

      public override fun type(): Any = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EdiConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty):
          EdiConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiConfigurationProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EdiTypeProperty {
    public fun x12Details(): Any

    public interface Builder {
      public fun x12Details(x12Details: IResolvable) {
      }

      public fun x12Details(x12Details: X12DetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23b4587c8e9ebabd3a19d1f1afbff5ed1f74627cc0c6a1bd285efac39369168")
      public fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty.builder()

      public override fun x12Details(x12Details: IResolvable) {
        cdkBuilder.x12Details(x12Details.let(IResolvable::unwrap))
      }

      public override fun x12Details(x12Details: X12DetailsProperty) {
        cdkBuilder.x12Details(x12Details.let(X12DetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23b4587c8e9ebabd3a19d1f1afbff5ed1f74627cc0c6a1bd285efac39369168")
      public override fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit): Unit =
          x12Details(X12DetailsProperty(x12Details))

      public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty,
    ) : EdiTypeProperty {
      public override fun x12Details(): Any = unwrap(this).getX12Details()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EdiTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty):
          EdiTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiTypeProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun key(): String? = unwrap(this).getKey()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun key(key: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty,
    ) : S3LocationProperty {
      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
