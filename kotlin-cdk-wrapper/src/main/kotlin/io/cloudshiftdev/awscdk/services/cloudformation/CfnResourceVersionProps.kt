@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnResourceVersionProps {
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  public fun schemaHandlerPackage(): String

  public fun typeName(): String

  @CdkDslMarker
  public interface Builder {
    public fun executionRoleArn(executionRoleArn: String)

    public fun loggingConfig(loggingConfig: IResolvable)

    public fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a97622801e36508b1a77db96fddb6892208de74ff62ced5f3d27db04f6d75678")
    public
        fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty.Builder.() -> Unit)

    public fun schemaHandlerPackage(schemaHandlerPackage: String)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps.builder()

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    override fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnResourceVersion.LoggingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a97622801e36508b1a77db96fddb6892208de74ff62ced5f3d27db04f6d75678")
    override
        fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnResourceVersion.LoggingConfigProperty(loggingConfig))

    override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps,
  ) : CdkObject(cdkObject), CfnResourceVersionProps {
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    override fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps):
        CfnResourceVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps
  }
}
