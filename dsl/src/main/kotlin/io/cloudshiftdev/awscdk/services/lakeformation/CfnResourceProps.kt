package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnResourceProps {
  /**
   * Indicates whether the data access of tables pointing to the location can be managed by both
   * Lake Formation permissions as well as Amazon S3 bucket policies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
   */
  public fun hybridAccessEnabled(): Any? = unwrap(this).getHybridAccessEnabled()

  /**
   * The Amazon Resource Name (ARN) of the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * The IAM role that registered a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
   */
  public fun useServiceLinkedRole(): Any

  /**
   * Allows Lake Formation to assume a role to access tables in a federated database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
   */
  public fun withFederation(): Any? = unwrap(this).getWithFederation()

  /**
   * A builder for [CfnResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     */
    public fun hybridAccessEnabled(hybridAccessEnabled: Boolean)

    /**
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     */
    public fun hybridAccessEnabled(hybridAccessEnabled: IResolvable)

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param roleArn The IAM role that registered a resource.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: Boolean)

    /**
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable)

    /**
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database.
     */
    public fun withFederation(withFederation: Boolean)

    /**
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database.
     */
    public fun withFederation(withFederation: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnResourceProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnResourceProps.builder()

    /**
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     */
    override fun hybridAccessEnabled(hybridAccessEnabled: Boolean) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled)
    }

    /**
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     */
    override fun hybridAccessEnabled(hybridAccessEnabled: IResolvable) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param roleArn The IAM role that registered a resource.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    override fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    /**
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    override fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole.let(IResolvable::unwrap))
    }

    /**
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database.
     */
    override fun withFederation(withFederation: Boolean) {
      cdkBuilder.withFederation(withFederation)
    }

    /**
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database.
     */
    override fun withFederation(withFederation: IResolvable) {
      cdkBuilder.withFederation(withFederation.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnResourceProps,
  ) : CdkObject(cdkObject), CfnResourceProps {
    /**
     * Indicates whether the data access of tables pointing to the location can be managed by both
     * Lake Formation permissions as well as Amazon S3 bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
     */
    override fun hybridAccessEnabled(): Any? = unwrap(this).getHybridAccessEnabled()

    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * The IAM role that registered a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data
     * Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
     */
    override fun useServiceLinkedRole(): Any = unwrap(this).getUseServiceLinkedRole()

    /**
     * Allows Lake Formation to assume a role to access tables in a federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
     */
    override fun withFederation(): Any? = unwrap(this).getWithFederation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnResourceProps):
        CfnResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceProps):
        software.amazon.awscdk.services.lakeformation.CfnResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lakeformation.CfnResourceProps
  }
}
