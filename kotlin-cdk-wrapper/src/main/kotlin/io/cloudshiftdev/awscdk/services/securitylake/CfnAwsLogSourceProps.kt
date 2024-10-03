@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securitylake

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAwsLogSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securitylake.*;
 * CfnAwsLogSourceProps cfnAwsLogSourceProps = CfnAwsLogSourceProps.builder()
 * .dataLakeArn("dataLakeArn")
 * .sourceName("sourceName")
 * .sourceVersion("sourceVersion")
 * // the properties below are optional
 * .accounts(List.of("accounts"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html)
 */
public interface CfnAwsLogSourceProps {
  /**
   * Specify the AWS account information where you want to enable Security Lake.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-accounts)
   */
  public fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) used to create the data lake.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-datalakearn)
   */
  public fun dataLakeArn(): String

  /**
   * The name for a AWS source.
   *
   * This must be a Regionally unique value. For the list of sources supported by Amazon Security
   * Lake see [Collecting data from AWS
   * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html) in
   * the Amazon Security Lake User Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourcename)
   */
  public fun sourceName(): String

  /**
   * The version for a AWS source.
   *
   * For more details about source versions supported by Amazon Security Lake see [OCSF source
   * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
   * in the Amazon Security Lake User Guide. This must be a Regionally unique value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourceversion)
   */
  public fun sourceVersion(): String

  /**
   * A builder for [CfnAwsLogSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accounts Specify the AWS account information where you want to enable Security Lake.
     */
    public fun accounts(accounts: List<String>)

    /**
     * @param accounts Specify the AWS account information where you want to enable Security Lake.
     */
    public fun accounts(vararg accounts: String)

    /**
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    public fun dataLakeArn(dataLakeArn: String)

    /**
     * @param sourceName The name for a AWS source. 
     * This must be a Regionally unique value. For the list of sources supported by Amazon Security
     * Lake see [Collecting data from AWS
     * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html) in
     * the Amazon Security Lake User Guide.
     */
    public fun sourceName(sourceName: String)

    /**
     * @param sourceVersion The version for a AWS source. 
     * For more details about source versions supported by Amazon Security Lake see [OCSF source
     * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
     * in the Amazon Security Lake User Guide. This must be a Regionally unique value.
     */
    public fun sourceVersion(sourceVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps.Builder =
        software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps.builder()

    /**
     * @param accounts Specify the AWS account information where you want to enable Security Lake.
     */
    override fun accounts(accounts: List<String>) {
      cdkBuilder.accounts(accounts)
    }

    /**
     * @param accounts Specify the AWS account information where you want to enable Security Lake.
     */
    override fun accounts(vararg accounts: String): Unit = accounts(accounts.toList())

    /**
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    override fun dataLakeArn(dataLakeArn: String) {
      cdkBuilder.dataLakeArn(dataLakeArn)
    }

    /**
     * @param sourceName The name for a AWS source. 
     * This must be a Regionally unique value. For the list of sources supported by Amazon Security
     * Lake see [Collecting data from AWS
     * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html) in
     * the Amazon Security Lake User Guide.
     */
    override fun sourceName(sourceName: String) {
      cdkBuilder.sourceName(sourceName)
    }

    /**
     * @param sourceVersion The version for a AWS source. 
     * For more details about source versions supported by Amazon Security Lake see [OCSF source
     * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
     * in the Amazon Security Lake User Guide. This must be a Regionally unique value.
     */
    override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    public fun build(): software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps,
  ) : CdkObject(cdkObject),
      CfnAwsLogSourceProps {
    /**
     * Specify the AWS account information where you want to enable Security Lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-accounts)
     */
    override fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) used to create the data lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-datalakearn)
     */
    override fun dataLakeArn(): String = unwrap(this).getDataLakeArn()

    /**
     * The name for a AWS source.
     *
     * This must be a Regionally unique value. For the list of sources supported by Amazon Security
     * Lake see [Collecting data from AWS
     * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html) in
     * the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourcename)
     */
    override fun sourceName(): String = unwrap(this).getSourceName()

    /**
     * The version for a AWS source.
     *
     * For more details about source versions supported by Amazon Security Lake see [OCSF source
     * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
     * in the Amazon Security Lake User Guide. This must be a Regionally unique value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourceversion)
     */
    override fun sourceVersion(): String = unwrap(this).getSourceVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAwsLogSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps):
        CfnAwsLogSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAwsLogSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAwsLogSourceProps):
        software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps
  }
}
