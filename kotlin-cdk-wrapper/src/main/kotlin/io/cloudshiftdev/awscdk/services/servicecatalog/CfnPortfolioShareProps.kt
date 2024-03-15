@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPortfolioShare`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnPortfolioShareProps cfnPortfolioShareProps = CfnPortfolioShareProps.builder()
 * .accountId("accountId")
 * .portfolioId("portfolioId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .shareTagOptions(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html)
 */
public interface CfnPortfolioShareProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The AWS account ID.
   *
   * For example, `123456789012` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
   */
  public fun accountId(): String

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
   */
  public fun portfolioId(): String

  /**
   * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
   */
  public fun shareTagOptions(): Any? = unwrap(this).getShareTagOptions()

  /**
   * A builder for [CfnPortfolioShareProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * @param accountId The AWS account ID. 
     * For example, `123456789012` .
     */
    public fun accountId(accountId: String)

    /**
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share.
     */
    public fun shareTagOptions(shareTagOptions: Boolean)

    /**
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share.
     */
    public fun shareTagOptions(shareTagOptions: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param accountId The AWS account ID. 
     * For example, `123456789012` .
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share.
     */
    override fun shareTagOptions(shareTagOptions: Boolean) {
      cdkBuilder.shareTagOptions(shareTagOptions)
    }

    /**
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share.
     */
    override fun shareTagOptions(shareTagOptions: IResolvable) {
      cdkBuilder.shareTagOptions(shareTagOptions.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps,
  ) : CdkObject(cdkObject), CfnPortfolioShareProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * The AWS account ID.
     *
     * For example, `123456789012` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
     */
    override fun accountId(): String = unwrap(this).getAccountId()

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
     */
    override fun shareTagOptions(): Any? = unwrap(this).getShareTagOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPortfolioShareProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps):
        CfnPortfolioShareProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioShareProps):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps
  }
}
