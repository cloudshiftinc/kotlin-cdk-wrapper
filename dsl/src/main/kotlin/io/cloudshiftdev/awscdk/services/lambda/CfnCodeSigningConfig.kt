package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCodeSigningConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun allowedPublishers(): Any = unwrap(this).getAllowedPublishers()

  public open fun allowedPublishers(`value`: IResolvable) {
    unwrap(this).setAllowedPublishers(`value`.let(IResolvable::unwrap))
  }

  public open fun allowedPublishers(`value`: AllowedPublishersProperty) {
    unwrap(this).setAllowedPublishers(`value`.let(AllowedPublishersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7664f939fdb01cca43ac2c240abfd9d052c562a12ef5438c5670dfc627e96536")
  public open fun allowedPublishers(`value`: AllowedPublishersProperty.Builder.() -> Unit): Unit =
      allowedPublishers(AllowedPublishersProperty(`value`))

  public open fun attrCodeSigningConfigArn(): String = unwrap(this).getAttrCodeSigningConfigArn()

  public open fun attrCodeSigningConfigId(): String = unwrap(this).getAttrCodeSigningConfigId()

  public open fun codeSigningPolicies(): Any? = unwrap(this).getCodeSigningPolicies()

  public open fun codeSigningPolicies(`value`: IResolvable) {
    unwrap(this).setCodeSigningPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun codeSigningPolicies(`value`: CodeSigningPoliciesProperty) {
    unwrap(this).setCodeSigningPolicies(`value`.let(CodeSigningPoliciesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f8eeb727f6c737f39415bd844347442f436c956edade458b12695875066bd78")
  public open fun codeSigningPolicies(`value`: CodeSigningPoliciesProperty.Builder.() -> Unit): Unit
      = codeSigningPolicies(CodeSigningPoliciesProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun allowedPublishers(allowedPublishers: IResolvable) {
    }

    public fun allowedPublishers(allowedPublishers: AllowedPublishersProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c2395a9a65c86a919fe259c9e87bafb8370a17fc1a777d0393a8be7354c0731")
    public fun allowedPublishers(allowedPublishers: AllowedPublishersProperty.Builder.() -> Unit) {
    }

    public fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
    }

    public fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e89c4bb122d8303bbd07d0c45a8ccec11bfba0a9205276573e8b3bdf0af14c6")
    public
        fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.Builder =
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.Builder.create(scope, id)

    public override fun allowedPublishers(allowedPublishers: IResolvable) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(IResolvable::unwrap))
    }

    public override fun allowedPublishers(allowedPublishers: AllowedPublishersProperty) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(AllowedPublishersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c2395a9a65c86a919fe259c9e87bafb8370a17fc1a777d0393a8be7354c0731")
    public override
        fun allowedPublishers(allowedPublishers: AllowedPublishersProperty.Builder.() -> Unit): Unit
        = allowedPublishers(AllowedPublishersProperty(allowedPublishers))

    public override fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(IResolvable::unwrap))
    }

    public override fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(CodeSigningPoliciesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e89c4bb122d8303bbd07d0c45a8ccec11bfba0a9205276573e8b3bdf0af14c6")
    public override
        fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty.Builder.() -> Unit):
        Unit = codeSigningPolicies(CodeSigningPoliciesProperty(codeSigningPolicies))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCodeSigningConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCodeSigningConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig):
        CfnCodeSigningConfig = CfnCodeSigningConfig(cdkObject)

    internal fun unwrap(wrapped: CfnCodeSigningConfig):
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfig = wrapped.cdkObject
  }

  public interface AllowedPublishersProperty {
    public fun signingProfileVersionArns(): List<String>

    public interface Builder {
      public fun signingProfileVersionArns(signingProfileVersionArns: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty.builder()

      public override fun signingProfileVersionArns(signingProfileVersionArns: List<String>) {
        cdkBuilder.signingProfileVersionArns(signingProfileVersionArns)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty,
    ) : AllowedPublishersProperty {
      public override fun signingProfileVersionArns(): List<String> =
          unwrap(this).getSigningProfileVersionArns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AllowedPublishersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty):
          AllowedPublishersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowedPublishersProperty):
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CodeSigningPoliciesProperty {
    public fun untrustedArtifactOnDeployment(): String

    public interface Builder {
      public fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty.builder()

      public override fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: String) {
        cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty,
    ) : CodeSigningPoliciesProperty {
      public override fun untrustedArtifactOnDeployment(): String =
          unwrap(this).getUntrustedArtifactOnDeployment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeSigningPoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty):
          CodeSigningPoliciesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeSigningPoliciesProperty):
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
