@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTypeActivationProps {
  public fun autoUpdate(): Any? = unwrap(this).getAutoUpdate()

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  public fun majorVersion(): String? = unwrap(this).getMajorVersion()

  public fun publicTypeArn(): String? = unwrap(this).getPublicTypeArn()

  public fun publisherId(): String? = unwrap(this).getPublisherId()

  public fun type(): String? = unwrap(this).getType()

  public fun typeName(): String? = unwrap(this).getTypeName()

  public fun typeNameAlias(): String? = unwrap(this).getTypeNameAlias()

  public fun versionBump(): String? = unwrap(this).getVersionBump()

  @CdkDslMarker
  public interface Builder {
    public fun autoUpdate(autoUpdate: Boolean)

    public fun autoUpdate(autoUpdate: IResolvable)

    public fun executionRoleArn(executionRoleArn: String)

    public fun loggingConfig(loggingConfig: IResolvable)

    public fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a43028c4e4a24d5dce39383e5610088c9f050dcd993ad7433a85bdddba31300b")
    public
        fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty.Builder.() -> Unit)

    public fun majorVersion(majorVersion: String)

    public fun publicTypeArn(publicTypeArn: String)

    public fun publisherId(publisherId: String)

    public fun type(type: String)

    public fun typeName(typeName: String)

    public fun typeNameAlias(typeNameAlias: String)

    public fun versionBump(versionBump: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTypeActivationProps.Builder =
        software.amazon.awscdk.CfnTypeActivationProps.builder()

    override fun autoUpdate(autoUpdate: Boolean) {
      cdkBuilder.autoUpdate(autoUpdate)
    }

    override fun autoUpdate(autoUpdate: IResolvable) {
      cdkBuilder.autoUpdate(autoUpdate.let(IResolvable::unwrap))
    }

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    override fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnTypeActivation.LoggingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a43028c4e4a24d5dce39383e5610088c9f050dcd993ad7433a85bdddba31300b")
    override
        fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnTypeActivation.LoggingConfigProperty(loggingConfig))

    override fun majorVersion(majorVersion: String) {
      cdkBuilder.majorVersion(majorVersion)
    }

    override fun publicTypeArn(publicTypeArn: String) {
      cdkBuilder.publicTypeArn(publicTypeArn)
    }

    override fun publisherId(publisherId: String) {
      cdkBuilder.publisherId(publisherId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    override fun typeNameAlias(typeNameAlias: String) {
      cdkBuilder.typeNameAlias(typeNameAlias)
    }

    override fun versionBump(versionBump: String) {
      cdkBuilder.versionBump(versionBump)
    }

    public fun build(): software.amazon.awscdk.CfnTypeActivationProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTypeActivationProps,
  ) : CdkObject(cdkObject), CfnTypeActivationProps {
    override fun autoUpdate(): Any? = unwrap(this).getAutoUpdate()

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    override fun majorVersion(): String? = unwrap(this).getMajorVersion()

    override fun publicTypeArn(): String? = unwrap(this).getPublicTypeArn()

    override fun publisherId(): String? = unwrap(this).getPublisherId()

    override fun type(): String? = unwrap(this).getType()

    override fun typeName(): String? = unwrap(this).getTypeName()

    override fun typeNameAlias(): String? = unwrap(this).getTypeNameAlias()

    override fun versionBump(): String? = unwrap(this).getVersionBump()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTypeActivationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTypeActivationProps):
        CfnTypeActivationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTypeActivationProps):
        software.amazon.awscdk.CfnTypeActivationProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnTypeActivationProps
  }
}
