@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnEventInvokeConfigProps {
  public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  public fun functionName(): String

  public fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

  public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  public fun qualifier(): String

  @CdkDslMarker
  public interface Builder {
    public fun destinationConfig(destinationConfig: IResolvable)

    public fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64b99df99a06cbb8645d797fcd6c72bf465a89145ba509290b04eb1839175f1a")
    public
        fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty.Builder.() -> Unit)

    public fun functionName(functionName: String)

    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps.Builder
        = software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps.builder()

    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
    }

    override
        fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(CfnEventInvokeConfig.DestinationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64b99df99a06cbb8645d797fcd6c72bf465a89145ba509290b04eb1839175f1a")
    override
        fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(CfnEventInvokeConfig.DestinationConfigProperty(destinationConfig))

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
      cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps,
  ) : CdkObject(cdkObject), CfnEventInvokeConfigProps {
    override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    override fun functionName(): String = unwrap(this).getFunctionName()

    override fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

    override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    override fun qualifier(): String = unwrap(this).getQualifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventInvokeConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps):
        CfnEventInvokeConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventInvokeConfigProps):
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
  }
}
