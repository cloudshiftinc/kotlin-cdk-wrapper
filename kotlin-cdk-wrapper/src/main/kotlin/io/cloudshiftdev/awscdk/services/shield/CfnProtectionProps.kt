@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProtectionProps {
  public fun applicationLayerAutomaticResponseConfiguration(): Any? =
      unwrap(this).getApplicationLayerAutomaticResponseConfiguration()

  public fun healthCheckArns(): List<String> = unwrap(this).getHealthCheckArns() ?: emptyList()

  public fun name(): String

  public fun resourceArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: IResolvable)

    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e0d509d4ff54e73473ccedba610367533f211ef77087a90bb4aae15a31ff6c")
    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit)

    public fun healthCheckArns(healthCheckArns: List<String>)

    public fun healthCheckArns(vararg healthCheckArns: String)

    public fun name(name: String)

    public fun resourceArn(resourceArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtectionProps.Builder =
        software.amazon.awscdk.services.shield.CfnProtectionProps.builder()

    override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: IResolvable) {
      cdkBuilder.applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration.let(IResolvable::unwrap))
    }

    override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty) {
      cdkBuilder.applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration.let(CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e0d509d4ff54e73473ccedba610367533f211ef77087a90bb4aae15a31ff6c")
    override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationLayerAutomaticResponseConfiguration(CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty(applicationLayerAutomaticResponseConfiguration))

    override fun healthCheckArns(healthCheckArns: List<String>) {
      cdkBuilder.healthCheckArns(healthCheckArns)
    }

    override fun healthCheckArns(vararg healthCheckArns: String): Unit =
        healthCheckArns(healthCheckArns.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.shield.CfnProtectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.shield.CfnProtectionProps,
  ) : CdkObject(cdkObject), CfnProtectionProps {
    override fun applicationLayerAutomaticResponseConfiguration(): Any? =
        unwrap(this).getApplicationLayerAutomaticResponseConfiguration()

    override fun healthCheckArns(): List<String> = unwrap(this).getHealthCheckArns() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun resourceArn(): String = unwrap(this).getResourceArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProtectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtectionProps):
        CfnProtectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProtectionProps):
        software.amazon.awscdk.services.shield.CfnProtectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.shield.CfnProtectionProps
  }
}
