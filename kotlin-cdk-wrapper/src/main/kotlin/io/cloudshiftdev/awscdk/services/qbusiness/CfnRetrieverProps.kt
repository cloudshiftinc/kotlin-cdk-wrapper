@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRetriever`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnRetrieverProps cfnRetrieverProps = CfnRetrieverProps.builder()
 * .applicationId("applicationId")
 * .configuration(RetrieverConfigurationProperty.builder()
 * .kendraIndexConfiguration(KendraIndexConfigurationProperty.builder()
 * .indexId("indexId")
 * .build())
 * .nativeIndexConfiguration(NativeIndexConfigurationProperty.builder()
 * .indexId("indexId")
 * .build())
 * .build())
 * .displayName("displayName")
 * .type("type")
 * // the properties below are optional
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html)
 */
public interface CfnRetrieverProps {
  /**
   * The identifier of the Amazon Q Business application using the retriever.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-applicationid)
   */
  public fun applicationId(): String

  /**
   * Provides information on how the retriever used for your Amazon Q Business application is
   * configured.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
   */
  public fun configuration(): Any

  /**
   * The name of your retriever.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-displayname)
   */
  public fun displayName(): String

  /**
   * The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials
   * stored in a Secrets Manager secret.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A list of key-value pairs that identify or categorize the retriever.
   *
   * You can also use tags to help control access to the retriever. Tag keys and values can consist
   * of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of your retriever.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnRetrieverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The identifier of the Amazon Q Business application using the retriever.
     * 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    public fun configuration(configuration: CfnRetriever.RetrieverConfigurationProperty)

    /**
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6c2f2cb7583d02d29c42acaecc0b11ee27bc3392e505d0dfb9ef4bd75c56b43")
    public
        fun configuration(configuration: CfnRetriever.RetrieverConfigurationProperty.Builder.() -> Unit)

    /**
     * @param displayName The name of your retriever. 
     */
    public fun displayName(displayName: String)

    /**
     * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the basic
     * authentication credentials stored in a Secrets Manager secret.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags A list of key-value pairs that identify or categorize the retriever.
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that identify or categorize the retriever.
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of your retriever. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnRetrieverProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnRetrieverProps.builder()

    /**
     * @param applicationId The identifier of the Amazon Q Business application using the retriever.
     * 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    override fun configuration(configuration: CfnRetriever.RetrieverConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnRetriever.RetrieverConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6c2f2cb7583d02d29c42acaecc0b11ee27bc3392e505d0dfb9ef4bd75c56b43")
    override
        fun configuration(configuration: CfnRetriever.RetrieverConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnRetriever.RetrieverConfigurationProperty(configuration))

    /**
     * @param displayName The name of your retriever. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the basic
     * authentication credentials stored in a Secrets Manager secret.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize the retriever.
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize the retriever.
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of your retriever. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnRetrieverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetrieverProps,
  ) : CdkObject(cdkObject),
      CfnRetrieverProps {
    /**
     * The identifier of the Amazon Q Business application using the retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Provides information on how the retriever used for your Amazon Q Business application is
     * configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * The name of your retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication
     * credentials stored in a Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A list of key-value pairs that identify or categorize the retriever.
     *
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of your retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRetrieverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetrieverProps):
        CfnRetrieverProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRetrieverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRetrieverProps):
        software.amazon.awscdk.services.qbusiness.CfnRetrieverProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.qbusiness.CfnRetrieverProps
  }
}
