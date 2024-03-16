@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPortfolioPrincipalAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnPortfolioPrincipalAssociationProps cfnPortfolioPrincipalAssociationProps =
 * CfnPortfolioPrincipalAssociationProps.builder()
 * .portfolioId("portfolioId")
 * .principalArn("principalArn")
 * .principalType("principalType")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html)
 */
public interface CfnPortfolioPrincipalAssociationProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
   */
  public fun portfolioId(): String

  /**
   * The ARN of the principal ( IAM user, role, or group).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
   */
  public fun principalArn(): String

  /**
   * The principal type.
   *
   * The supported values are `IAM` and `IAM_PATTERN` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
   */
  public fun principalType(): String

  /**
   * A builder for [CfnPortfolioPrincipalAssociationProps]
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
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * @param principalArn The ARN of the principal ( IAM user, role, or group). 
     */
    public fun principalArn(principalArn: String)

    /**
     * @param principalType The principal type. 
     * The supported values are `IAM` and `IAM_PATTERN` .
     */
    public fun principalType(principalType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps.Builder
        =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * @param principalArn The ARN of the principal ( IAM user, role, or group). 
     */
    override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

    /**
     * @param principalType The principal type. 
     * The supported values are `IAM` and `IAM_PATTERN` .
     */
    override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps,
  ) : CdkObject(cdkObject), CfnPortfolioPrincipalAssociationProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * The ARN of the principal ( IAM user, role, or group).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
     */
    override fun principalArn(): String = unwrap(this).getPrincipalArn()

    /**
     * The principal type.
     *
     * The supported values are `IAM` and `IAM_PATTERN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
     */
    override fun principalType(): String = unwrap(this).getPrincipalType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnPortfolioPrincipalAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps):
        CfnPortfolioPrincipalAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnPortfolioPrincipalAssociationProps

    internal fun unwrap(wrapped: CfnPortfolioPrincipalAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps
  }
}
