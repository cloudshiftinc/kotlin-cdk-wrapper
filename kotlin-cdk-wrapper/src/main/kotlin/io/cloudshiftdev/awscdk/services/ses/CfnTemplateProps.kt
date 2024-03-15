@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnTemplateProps cfnTemplateProps = CfnTemplateProps.builder()
 * .template(TemplateProperty.builder()
 * .subjectPart("subjectPart")
 * // the properties below are optional
 * .htmlPart("htmlPart")
 * .templateName("templateName")
 * .textPart("textPart")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html)
 */
public interface CfnTemplateProps {
  /**
   * The content of the email, composed of a subject line and either an HTML part or a text-only
   * part.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
   */
  public fun template(): Any? = unwrap(this).getTemplate()

  /**
   * A builder for [CfnTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part.
     */
    public fun template(template: IResolvable)

    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part.
     */
    public fun template(template: CfnTemplate.TemplateProperty)

    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952617196499dacbe1d4e4b7aa4d14f6b02a95468151ae430478e61d46cea0a5")
    public fun template(template: CfnTemplate.TemplateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnTemplateProps.Builder =
        software.amazon.awscdk.services.ses.CfnTemplateProps.builder()

    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part.
     */
    override fun template(template: IResolvable) {
      cdkBuilder.template(template.let(IResolvable::unwrap))
    }

    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part.
     */
    override fun template(template: CfnTemplate.TemplateProperty) {
      cdkBuilder.template(template.let(CfnTemplate.TemplateProperty::unwrap))
    }

    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952617196499dacbe1d4e4b7aa4d14f6b02a95468151ae430478e61d46cea0a5")
    override fun template(template: CfnTemplate.TemplateProperty.Builder.() -> Unit): Unit =
        template(CfnTemplate.TemplateProperty(template))

    public fun build(): software.amazon.awscdk.services.ses.CfnTemplateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnTemplateProps,
  ) : CdkObject(cdkObject), CfnTemplateProps {
    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     */
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
