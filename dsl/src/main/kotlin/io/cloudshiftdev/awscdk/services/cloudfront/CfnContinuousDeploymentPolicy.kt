package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnContinuousDeploymentPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun continuousDeploymentPolicyConfig(): Any =
      unwrap(this).getContinuousDeploymentPolicyConfig()

  public open fun continuousDeploymentPolicyConfig(`value`: IResolvable) {
    unwrap(this).setContinuousDeploymentPolicyConfig(`value`.let(IResolvable::unwrap))
  }

  public open
      fun continuousDeploymentPolicyConfig(`value`: ContinuousDeploymentPolicyConfigProperty) {
    unwrap(this).setContinuousDeploymentPolicyConfig(`value`.let(ContinuousDeploymentPolicyConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf14f33ea5dfd05cab983d82d38ad11339d4023d2d17e81b9b7cfa73647c4afe")
  public open
      fun continuousDeploymentPolicyConfig(`value`: ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
      Unit = continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
    }

    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02aec362a43d44818e6bc8847a1309a63040670369a0299060c34fe44c82b1fa")
    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.Builder.create(scope,
        id)

    public override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(IResolvable::unwrap))
    }

    public override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(ContinuousDeploymentPolicyConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02aec362a43d44818e6bc8847a1309a63040670369a0299060c34fe44c82b1fa")
    public override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty(continuousDeploymentPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContinuousDeploymentPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContinuousDeploymentPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy):
        CfnContinuousDeploymentPolicy = CfnContinuousDeploymentPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnContinuousDeploymentPolicy):
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy = wrapped.cdkObject
  }

  public interface TrafficConfigProperty {
    public fun singleHeaderConfig(): Any? = unwrap(this).getSingleHeaderConfig()

    public fun singleWeightConfig(): Any? = unwrap(this).getSingleWeightConfig()

    public fun type(): String

    public interface Builder {
      public fun singleHeaderConfig(singleHeaderConfig: IResolvable) {
      }

      public fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d493f05136abb55d2ad8f7caeb155f0a8fa4dd8ab52c0a79406cb90c57e29fa")
      public
          fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty.Builder.() -> Unit) {
      }

      public fun singleWeightConfig(singleWeightConfig: IResolvable) {
      }

      public fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc84ae95061411aac39bf13982bcd477f4ed3f1c68cb141ee06b3ad449628f94")
      public
          fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty.builder()

      public override fun singleHeaderConfig(singleHeaderConfig: IResolvable) {
        cdkBuilder.singleHeaderConfig(singleHeaderConfig.let(IResolvable::unwrap))
      }

      public override fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty) {
        cdkBuilder.singleHeaderConfig(singleHeaderConfig.let(SingleHeaderConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d493f05136abb55d2ad8f7caeb155f0a8fa4dd8ab52c0a79406cb90c57e29fa")
      public override
          fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty.Builder.() -> Unit):
          Unit = singleHeaderConfig(SingleHeaderConfigProperty(singleHeaderConfig))

      public override fun singleWeightConfig(singleWeightConfig: IResolvable) {
        cdkBuilder.singleWeightConfig(singleWeightConfig.let(IResolvable::unwrap))
      }

      public override fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty) {
        cdkBuilder.singleWeightConfig(singleWeightConfig.let(SingleWeightConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc84ae95061411aac39bf13982bcd477f4ed3f1c68cb141ee06b3ad449628f94")
      public override
          fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty.Builder.() -> Unit):
          Unit = singleWeightConfig(SingleWeightConfigProperty(singleWeightConfig))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty,
    ) : TrafficConfigProperty {
      public override fun singleHeaderConfig(): Any? = unwrap(this).getSingleHeaderConfig()

      public override fun singleWeightConfig(): Any? = unwrap(this).getSingleWeightConfig()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty):
          TrafficConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleWeightPolicyConfigProperty {
    public fun sessionStickinessConfig(): Any? = unwrap(this).getSessionStickinessConfig()

    public fun weight(): Number

    public interface Builder {
      public fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
      }

      public fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a16445b31759c204e527d9438144fd1c2e1960ae5d2a6dc3696de87e89688d")
      public
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty.builder()

      public override fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(IResolvable::unwrap))
      }

      public override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(SessionStickinessConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a16445b31759c204e527d9438144fd1c2e1960ae5d2a6dc3696de87e89688d")
      public override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit):
          Unit = sessionStickinessConfig(SessionStickinessConfigProperty(sessionStickinessConfig))

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty,
    ) : SingleWeightPolicyConfigProperty {
      public override fun sessionStickinessConfig(): Any? =
          unwrap(this).getSessionStickinessConfig()

      public override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleWeightPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty):
          SingleWeightPolicyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleWeightPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContinuousDeploymentPolicyConfigProperty {
    public fun enabled(): Any

    public fun singleHeaderPolicyConfig(): Any? = unwrap(this).getSingleHeaderPolicyConfig()

    public fun singleWeightPolicyConfig(): Any? = unwrap(this).getSingleWeightPolicyConfig()

    public fun stagingDistributionDnsNames(): List<String>

    public fun trafficConfig(): Any? = unwrap(this).getTrafficConfig()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: IResolvable) {
      }

      public
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3726686afad905a9ae332c59666b4e79992e2ef6b09a46c71eae50b0f2b1baba")
      public
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty.Builder.() -> Unit) {
      }

      public fun singleWeightPolicyConfig(singleWeightPolicyConfig: IResolvable) {
      }

      public
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b409a905c8af0d9da494ea94eba46db86e04d8aa819d02c56fff7a470b36020b")
      public
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty.Builder.() -> Unit) {
      }

      public fun stagingDistributionDnsNames(stagingDistributionDnsNames: List<String>) {
      }

      public fun trafficConfig(trafficConfig: IResolvable) {
      }

      public fun trafficConfig(trafficConfig: TrafficConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f18d10221ae381cfb3f3c1e0759c5ead3f14d94b734e082cce12fa39f182e9")
      public fun trafficConfig(trafficConfig: TrafficConfigProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: IResolvable) {
        cdkBuilder.singleHeaderPolicyConfig(singleHeaderPolicyConfig.let(IResolvable::unwrap))
      }

      public override
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty) {
        cdkBuilder.singleHeaderPolicyConfig(singleHeaderPolicyConfig.let(SingleHeaderPolicyConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3726686afad905a9ae332c59666b4e79992e2ef6b09a46c71eae50b0f2b1baba")
      public override
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty.Builder.() -> Unit):
          Unit =
          singleHeaderPolicyConfig(SingleHeaderPolicyConfigProperty(singleHeaderPolicyConfig))

      public override fun singleWeightPolicyConfig(singleWeightPolicyConfig: IResolvable) {
        cdkBuilder.singleWeightPolicyConfig(singleWeightPolicyConfig.let(IResolvable::unwrap))
      }

      public override
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty) {
        cdkBuilder.singleWeightPolicyConfig(singleWeightPolicyConfig.let(SingleWeightPolicyConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b409a905c8af0d9da494ea94eba46db86e04d8aa819d02c56fff7a470b36020b")
      public override
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty.Builder.() -> Unit):
          Unit =
          singleWeightPolicyConfig(SingleWeightPolicyConfigProperty(singleWeightPolicyConfig))

      public override fun stagingDistributionDnsNames(stagingDistributionDnsNames: List<String>) {
        cdkBuilder.stagingDistributionDnsNames(stagingDistributionDnsNames)
      }

      public override fun trafficConfig(trafficConfig: IResolvable) {
        cdkBuilder.trafficConfig(trafficConfig.let(IResolvable::unwrap))
      }

      public override fun trafficConfig(trafficConfig: TrafficConfigProperty) {
        cdkBuilder.trafficConfig(trafficConfig.let(TrafficConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f18d10221ae381cfb3f3c1e0759c5ead3f14d94b734e082cce12fa39f182e9")
      public override fun trafficConfig(trafficConfig: TrafficConfigProperty.Builder.() -> Unit):
          Unit = trafficConfig(TrafficConfigProperty(trafficConfig))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty,
    ) : ContinuousDeploymentPolicyConfigProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun singleHeaderPolicyConfig(): Any? =
          unwrap(this).getSingleHeaderPolicyConfig()

      public override fun singleWeightPolicyConfig(): Any? =
          unwrap(this).getSingleWeightPolicyConfig()

      public override fun stagingDistributionDnsNames(): List<String> =
          unwrap(this).getStagingDistributionDnsNames() ?: emptyList()

      public override fun trafficConfig(): Any? = unwrap(this).getTrafficConfig()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContinuousDeploymentPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty):
          ContinuousDeploymentPolicyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContinuousDeploymentPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleHeaderConfigProperty {
    public fun `header`(): String

    public fun `value`(): String

    public interface Builder {
      public fun `header`(`header`: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.builder()

      public override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty,
    ) : SingleHeaderConfigProperty {
      public override fun `header`(): String = unwrap(this).getHeader()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty):
          SingleHeaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SessionStickinessConfigProperty {
    public fun idleTtl(): Number

    public fun maximumTtl(): Number

    public interface Builder {
      public fun idleTtl(idleTtl: Number) {
      }

      public fun maximumTtl(maximumTtl: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.builder()

      public override fun idleTtl(idleTtl: Number) {
        cdkBuilder.idleTtl(idleTtl)
      }

      public override fun maximumTtl(maximumTtl: Number) {
        cdkBuilder.maximumTtl(maximumTtl)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty,
    ) : SessionStickinessConfigProperty {
      public override fun idleTtl(): Number = unwrap(this).getIdleTtl()

      public override fun maximumTtl(): Number = unwrap(this).getMaximumTtl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SessionStickinessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty):
          SessionStickinessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionStickinessConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleHeaderPolicyConfigProperty {
    public fun `header`(): String

    public fun `value`(): String

    public interface Builder {
      public fun `header`(`header`: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty.builder()

      public override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty,
    ) : SingleHeaderPolicyConfigProperty {
      public override fun `header`(): String = unwrap(this).getHeader()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty):
          SingleHeaderPolicyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleWeightConfigProperty {
    public fun sessionStickinessConfig(): Any? = unwrap(this).getSessionStickinessConfig()

    public fun weight(): Number

    public interface Builder {
      public fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
      }

      public fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("115c2e3d2be2a6141618d5281ac3254846c109b072920033bb4c3a6d8305f28e")
      public
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.builder()

      public override fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(IResolvable::unwrap))
      }

      public override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(SessionStickinessConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("115c2e3d2be2a6141618d5281ac3254846c109b072920033bb4c3a6d8305f28e")
      public override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit):
          Unit = sessionStickinessConfig(SessionStickinessConfigProperty(sessionStickinessConfig))

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty,
    ) : SingleWeightConfigProperty {
      public override fun sessionStickinessConfig(): Any? =
          unwrap(this).getSessionStickinessConfig()

      public override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleWeightConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty):
          SingleWeightConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleWeightConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
