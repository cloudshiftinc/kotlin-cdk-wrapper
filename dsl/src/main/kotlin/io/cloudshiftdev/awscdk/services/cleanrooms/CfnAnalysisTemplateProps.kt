package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAnalysisTemplateProps {
  /**
   * The parameters of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
   */
  public fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

  /**
   * The description of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The format of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-format)
   */
  public fun format(): String

  /**
   * The identifier for a membership resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-membershipidentifier)
   */
  public fun membershipIdentifier(): String

  /**
   * The name of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-name)
   */
  public fun name(): String

  /**
   * The source of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
   */
  public fun source(): Any

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAnalysisTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(analysisParameters: IResolvable)

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(analysisParameters: List<Any>)

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(vararg analysisParameters: Any)

    /**
     * @param description The description of the analysis template.
     */
    public fun description(description: String)

    /**
     * @param format The format of the analysis template. 
     */
    public fun format(format: String)

    /**
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * @param name The name of the analysis template. 
     */
    public fun name(name: String)

    /**
     * @param source The source of the analysis template. 
     */
    public fun source(source: IResolvable)

    /**
     * @param source The source of the analysis template. 
     */
    public fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty)

    /**
     * @param source The source of the analysis template. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d318518d69866fb3b317dab255838a7b0f145eb57d564ae2fcf7d5c65a790eb")
    public fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty.Builder.() -> Unit)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps.builder()

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    override fun analysisParameters(analysisParameters: IResolvable) {
      cdkBuilder.analysisParameters(analysisParameters.let(IResolvable::unwrap))
    }

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    override fun analysisParameters(analysisParameters: List<Any>) {
      cdkBuilder.analysisParameters(analysisParameters)
    }

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    override fun analysisParameters(vararg analysisParameters: Any): Unit =
        analysisParameters(analysisParameters.toList())

    /**
     * @param description The description of the analysis template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param format The format of the analysis template. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param name The name of the analysis template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param source The source of the analysis template. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * @param source The source of the analysis template. 
     */
    override fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty) {
      cdkBuilder.source(source.let(CfnAnalysisTemplate.AnalysisSourceProperty::unwrap))
    }

    /**
     * @param source The source of the analysis template. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d318518d69866fb3b317dab255838a7b0f145eb57d564ae2fcf7d5c65a790eb")
    override fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty.Builder.() -> Unit): Unit
        = source(CfnAnalysisTemplate.AnalysisSourceProperty(source))

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps,
  ) : CdkObject(cdkObject), CfnAnalysisTemplateProps {
    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     */
    override fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

    /**
     * The description of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The format of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-format)
     */
    override fun format(): String = unwrap(this).getFormat()

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-membershipidentifier)
     */
    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    /**
     * The name of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     */
    override fun source(): Any = unwrap(this).getSource()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnalysisTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps):
        CfnAnalysisTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnalysisTemplateProps):
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps
  }
}
