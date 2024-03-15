@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTemplateProps {
  public fun template(): Any? = unwrap(this).getTemplate()

  @CdkDslMarker
  public interface Builder {
    public fun template(template: IResolvable)

    public fun template(template: CfnTemplate.TemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952617196499dacbe1d4e4b7aa4d14f6b02a95468151ae430478e61d46cea0a5")
    public fun template(template: CfnTemplate.TemplateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnTemplateProps.Builder =
        software.amazon.awscdk.services.ses.CfnTemplateProps.builder()

    override fun template(template: IResolvable) {
      cdkBuilder.template(template.let(IResolvable::unwrap))
    }

    override fun template(template: CfnTemplate.TemplateProperty) {
      cdkBuilder.template(template.let(CfnTemplate.TemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952617196499dacbe1d4e4b7aa4d14f6b02a95468151ae430478e61d46cea0a5")
    override fun template(template: CfnTemplate.TemplateProperty.Builder.() -> Unit): Unit =
        template(CfnTemplate.TemplateProperty(template))

    public fun build(): software.amazon.awscdk.services.ses.CfnTemplateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnTemplateProps,
  ) : CdkObject(cdkObject), CfnTemplateProps {
    override fun template(): Any? = unwrap(this).getTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnTemplateProps):
        CfnTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateProps):
        software.amazon.awscdk.services.ses.CfnTemplateProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.CfnTemplateProps
  }
}
