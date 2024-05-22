@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securitylake

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds a natively supported AWS service as an AWS source.
 *
 * Enables source types for member accounts in required AWS Regions, based on the parameters you
 * specify. You can choose any source type in any Region for either accounts that are part of a trusted
 * organization or standalone accounts. Once you add an AWS service as a source, Security Lake starts
 * collecting logs and events from it.
 *
 *
 * If you want to create multiple sources using `AWS::SecurityLake::AwsLogSource` , you must use the
 * `DependsOn` attribute to create the sources sequentially. With the `DependsOn` attribute you can
 * specify that the creation of a specific `AWSLogSource` follows another. When you add a `DependsOn`
 * attribute to a resource, that resource is created only after the creation of the resource specified
 * in the `DependsOn` attribute. For an example, see [Add AWS log
 * sources](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#aws-resource-securitylake-awslogsource--examples)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securitylake.*;
 * CfnAwsLogSource cfnAwsLogSource = CfnAwsLogSource.Builder.create(this, "MyCfnAwsLogSource")
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
public open class CfnAwsLogSource(
  cdkObject: software.amazon.awscdk.services.securitylake.CfnAwsLogSource,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAwsLogSourceProps,
  ) :
      this(software.amazon.awscdk.services.securitylake.CfnAwsLogSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAwsLogSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAwsLogSourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAwsLogSourceProps(props)
  )

  /**
   * Specify the AWS account information where you want to enable Security Lake.
   */
  public open fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

  /**
   * Specify the AWS account information where you want to enable Security Lake.
   */
  public open fun accounts(`value`: List<String>) {
    unwrap(this).setAccounts(`value`)
  }

  /**
   * Specify the AWS account information where you want to enable Security Lake.
   */
  public open fun accounts(vararg `value`: String): Unit = accounts(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) used to create the data lake.
   */
  public open fun dataLakeArn(): String = unwrap(this).getDataLakeArn()

  /**
   * The Amazon Resource Name (ARN) used to create the data lake.
   */
  public open fun dataLakeArn(`value`: String) {
    unwrap(this).setDataLakeArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name for a AWS source.
   */
  public open fun sourceName(): String = unwrap(this).getSourceName()

  /**
   * The name for a AWS source.
   */
  public open fun sourceName(`value`: String) {
    unwrap(this).setSourceName(`value`)
  }

  /**
   * The version for a AWS source.
   */
  public open fun sourceVersion(): String = unwrap(this).getSourceVersion()

  /**
   * The version for a AWS source.
   */
  public open fun sourceVersion(`value`: String) {
    unwrap(this).setSourceVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securitylake.CfnAwsLogSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify the AWS account information where you want to enable Security Lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-accounts)
     * @param accounts Specify the AWS account information where you want to enable Security Lake. 
     */
    public fun accounts(accounts: List<String>)

    /**
     * Specify the AWS account information where you want to enable Security Lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-accounts)
     * @param accounts Specify the AWS account information where you want to enable Security Lake. 
     */
    public fun accounts(vararg accounts: String)

    /**
     * The Amazon Resource Name (ARN) used to create the data lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-datalakearn)
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    public fun dataLakeArn(dataLakeArn: String)

    /**
     * The name for a AWS source.
     *
     * This must be a Regionally unique value. For the list of sources supported by Amazon Security
     * Lake see [Collecting data from AWS
     * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html) in
     * the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourcename)
     * @param sourceName The name for a AWS source. 
     */
    public fun sourceName(sourceName: String)

    /**
     * The version for a AWS source.
     *
     * For more details about source versions supported by Amazon Security Lake see [OCSF source
     * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
     * in the Amazon Security Lake User Guide. This must be a Regionally unique value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourceversion)
     * @param sourceVersion The version for a AWS source. 
     */
    public fun sourceVersion(sourceVersion: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securitylake.CfnAwsLogSource.Builder =
        software.amazon.awscdk.services.securitylake.CfnAwsLogSource.Builder.create(scope, id)

    /**
     * Specify the AWS account information where you want to enable Security Lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-accounts)
     * @param accounts Specify the AWS account information where you want to enable Security Lake. 
     */
    override fun accounts(accounts: List<String>) {
      cdkBuilder.accounts(accounts)
    }

    /**
     * Specify the AWS account information where you want to enable Security Lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-accounts)
     * @param accounts Specify the AWS account information where you want to enable Security Lake. 
     */
    override fun accounts(vararg accounts: String): Unit = accounts(accounts.toList())

    /**
     * The Amazon Resource Name (ARN) used to create the data lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-datalakearn)
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    override fun dataLakeArn(dataLakeArn: String) {
      cdkBuilder.dataLakeArn(dataLakeArn)
    }

    /**
     * The name for a AWS source.
     *
     * This must be a Regionally unique value. For the list of sources supported by Amazon Security
     * Lake see [Collecting data from AWS
     * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html) in
     * the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourcename)
     * @param sourceName The name for a AWS source. 
     */
    override fun sourceName(sourceName: String) {
      cdkBuilder.sourceName(sourceName)
    }

    /**
     * The version for a AWS source.
     *
     * For more details about source versions supported by Amazon Security Lake see [OCSF source
     * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
     * in the Amazon Security Lake User Guide. This must be a Regionally unique value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-awslogsource.html#cfn-securitylake-awslogsource-sourceversion)
     * @param sourceVersion The version for a AWS source. 
     */
    override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    public fun build(): software.amazon.awscdk.services.securitylake.CfnAwsLogSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securitylake.CfnAwsLogSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAwsLogSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAwsLogSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnAwsLogSource):
        CfnAwsLogSource = CfnAwsLogSource(cdkObject)

    internal fun unwrap(wrapped: CfnAwsLogSource):
        software.amazon.awscdk.services.securitylake.CfnAwsLogSource = wrapped.cdkObject as
        software.amazon.awscdk.services.securitylake.CfnAwsLogSource
  }
}
