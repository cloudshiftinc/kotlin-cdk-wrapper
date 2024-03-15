@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccessPointProps {
  public fun name(): String? = unwrap(this).getName()

  public fun objectLambdaConfiguration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable)

    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2aee90219fde1a08643e2903d99e4652c1ec66f7e3a1c05615e366d4d7e4a828")
    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(IResolvable::unwrap))
    }

    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(CfnAccessPoint.ObjectLambdaConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2aee90219fde1a08643e2903d99e4652c1ec66f7e3a1c05615e366d4d7e4a828")
    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder.() -> Unit):
        Unit =
        objectLambdaConfiguration(CfnAccessPoint.ObjectLambdaConfigurationProperty(objectLambdaConfiguration))

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps,
  ) : CdkObject(cdkObject), CfnAccessPointProps {
    override fun name(): String? = unwrap(this).getName()

    override fun objectLambdaConfiguration(): Any = unwrap(this).getObjectLambdaConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps):
        CfnAccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps
  }
}
