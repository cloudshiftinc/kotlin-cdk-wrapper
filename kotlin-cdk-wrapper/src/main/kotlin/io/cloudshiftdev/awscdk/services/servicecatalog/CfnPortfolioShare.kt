@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Shares the specified portfolio with the specified account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnPortfolioShare cfnPortfolioShare = CfnPortfolioShare.Builder.create(this,
 * "MyCfnPortfolioShare")
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
public open class CfnPortfolioShare(
  cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPortfolioShareProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPortfolioShareProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPortfolioShareProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPortfolioShareProps(props)
  )

  /**
   * The language code.
   */
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The language code.
   */
  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  /**
   * The AWS account ID.
   */
  public open fun accountId(): String = unwrap(this).getAccountId()

  /**
   * The AWS account ID.
   */
  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The portfolio identifier.
   */
  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  /**
   * The portfolio identifier.
   */
  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  /**
   * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
   */
  public open fun shareTagOptions(): Any? = unwrap(this).getShareTagOptions()

  /**
   * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
   */
  public open fun shareTagOptions(`value`: Boolean) {
    unwrap(this).setShareTagOptions(`value`)
  }

  /**
   * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
   */
  public open fun shareTagOptions(`value`: IResolvable) {
    unwrap(this).setShareTagOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CfnPortfolioShare].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * The AWS account ID.
     *
     * For example, `123456789012` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
     * @param accountId The AWS account ID. 
     */
    public fun accountId(accountId: String)

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share. 
     */
    public fun shareTagOptions(shareTagOptions: Boolean)

    /**
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share. 
     */
    public fun shareTagOptions(shareTagOptions: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare.Builder
        = software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare.Builder.create(scope, id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The AWS account ID.
     *
     * For example, `123456789012` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
     * @param accountId The AWS account ID. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share. 
     */
    override fun shareTagOptions(shareTagOptions: Boolean) {
      cdkBuilder.shareTagOptions(shareTagOptions)
    }

    /**
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     * portfolio share. 
     */
    override fun shareTagOptions(shareTagOptions: IResolvable) {
      cdkBuilder.shareTagOptions(shareTagOptions.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortfolioShare {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortfolioShare(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare):
        CfnPortfolioShare = CfnPortfolioShare(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioShare):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare = wrapped.cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
  }
}
