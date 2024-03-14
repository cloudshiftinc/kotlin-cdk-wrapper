package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRealtimeLogConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun endPoints(): Any = unwrap(this).getEndPoints()

  public open fun endPoints(`value`: IResolvable) {
    unwrap(this).setEndPoints(`value`.let(IResolvable::unwrap))
  }

  public open fun endPoints(__idx_ac66f0: List<Any>) {
    unwrap(this).setEndPoints(__idx_ac66f0)
  }

  public open fun endPoints(vararg __idx_ac66f0: Any): Unit = endPoints(__idx_ac66f0.toList())

  public open fun fields(): List<String> = unwrap(this).getFields()

  public open fun fields(`value`: List<String>) {
    unwrap(this).setFields(`value`)
  }

  public open fun fields(vararg `value`: String): Unit = fields(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun samplingRate(): Number = unwrap(this).getSamplingRate()

  public open fun samplingRate(`value`: Number) {
    unwrap(this).setSamplingRate(`value`)
  }

  public interface Builder {
    public fun endPoints(endPoints: IResolvable)

    public fun endPoints(endPoints: List<Any>)

    public fun endPoints(vararg endPoints: Any)

    public fun fields(fields: List<String>)

    public fun fields(vararg fields: String)

    public fun name(name: String)

    public fun samplingRate(samplingRate: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.Builder
        = software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.Builder.create(scope, id)

    override fun endPoints(endPoints: IResolvable) {
      cdkBuilder.endPoints(endPoints.let(IResolvable::unwrap))
    }

    override fun endPoints(endPoints: List<Any>) {
      cdkBuilder.endPoints(endPoints)
    }

    override fun endPoints(vararg endPoints: Any): Unit = endPoints(endPoints.toList())

    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRealtimeLogConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRealtimeLogConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig):
        CfnRealtimeLogConfig = CfnRealtimeLogConfig(cdkObject)

    internal fun unwrap(wrapped: CfnRealtimeLogConfig):
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig = wrapped.cdkObject
  }

  public interface KinesisStreamConfigProperty {
    public fun roleArn(): String

    public fun streamArn(): String

    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty,
    ) : KinesisStreamConfigProperty {
      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty):
          KinesisStreamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndPointProperty {
    public fun kinesisStreamConfig(): Any

    public fun streamType(): String

    public interface Builder {
      public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable)

      public fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21e06eb0d0db3e46cab2d6c2972df2baca66b17c976eb901ccf7465cf00c8344")
      public
          fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit)

      public fun streamType(streamType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty.builder()

      override fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(IResolvable::unwrap))
      }

      override fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(KinesisStreamConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21e06eb0d0db3e46cab2d6c2972df2baca66b17c976eb901ccf7465cf00c8344")
      override
          fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit):
          Unit = kinesisStreamConfig(KinesisStreamConfigProperty(kinesisStreamConfig))

      override fun streamType(streamType: String) {
        cdkBuilder.streamType(streamType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty,
    ) : EndPointProperty {
      override fun kinesisStreamConfig(): Any = unwrap(this).getKinesisStreamConfig()

      override fun streamType(): String = unwrap(this).getStreamType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty):
          EndPointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndPointProperty):
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
