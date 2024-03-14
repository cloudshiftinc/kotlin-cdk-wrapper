package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPublicKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKey,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun publicKeyConfig(): Any = unwrap(this).getPublicKeyConfig()

  public open fun publicKeyConfig(`value`: IResolvable) {
    unwrap(this).setPublicKeyConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun publicKeyConfig(`value`: PublicKeyConfigProperty) {
    unwrap(this).setPublicKeyConfig(`value`.let(PublicKeyConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("758d14856eb69d434dabe179f5efd2ac8c821fb8b2a376596b1da3fcee116572")
  public open fun publicKeyConfig(`value`: PublicKeyConfigProperty.Builder.() -> Unit): Unit =
      publicKeyConfig(PublicKeyConfigProperty(`value`))

  public interface Builder {
    public fun publicKeyConfig(publicKeyConfig: IResolvable) {
    }

    public fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42e777796ad459c33fdafc47fe4a817807ae20a6174a38d3aa3ff93558bc3272")
    public fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnPublicKey.Builder =
        software.amazon.awscdk.services.cloudfront.CfnPublicKey.Builder.create(scope, id)

    public override fun publicKeyConfig(publicKeyConfig: IResolvable) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(IResolvable::unwrap))
    }

    public override fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(PublicKeyConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42e777796ad459c33fdafc47fe4a817807ae20a6174a38d3aa3ff93558bc3272")
    public override
        fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty.Builder.() -> Unit): Unit =
        publicKeyConfig(PublicKeyConfigProperty(publicKeyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnPublicKey = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublicKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublicKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKey):
        CfnPublicKey = CfnPublicKey(cdkObject)

    internal fun unwrap(wrapped: CfnPublicKey):
        software.amazon.awscdk.services.cloudfront.CfnPublicKey = wrapped.cdkObject
  }

  public interface PublicKeyConfigProperty {
    public fun callerReference(): String

    public fun comment(): String? = unwrap(this).getComment()

    public fun encodedKey(): String

    public fun name(): String

    public interface Builder {
      public fun callerReference(callerReference: String) {
      }

      public fun comment(comment: String) {
      }

      public fun encodedKey(encodedKey: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty.builder()

      public override fun callerReference(callerReference: String) {
        cdkBuilder.callerReference(callerReference)
      }

      public override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      public override fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty,
    ) : PublicKeyConfigProperty {
      public override fun callerReference(): String = unwrap(this).getCallerReference()

      public override fun comment(): String? = unwrap(this).getComment()

      public override fun encodedKey(): String = unwrap(this).getEncodedKey()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PublicKeyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty):
          PublicKeyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicKeyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
