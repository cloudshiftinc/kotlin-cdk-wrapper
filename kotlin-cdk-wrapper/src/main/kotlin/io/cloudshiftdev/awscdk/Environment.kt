@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The deployment environment for a stack.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build()))
 * .build();
 * globalTable.addReplica(ReplicaTableProps.builder().region("us-east-2").deletionProtection(true).build());
 * ```
 */
public interface Environment {
  /**
   * The AWS account ID for this environment.
   *
   * This can be either a concrete value such as `585191031104` or `Aws.ACCOUNT_ID` which
   * indicates that account ID will only be determined during deployment (it
   * will resolve to the CloudFormation intrinsic `{"Ref":"AWS::AccountId"}`).
   * Note that certain features, such as cross-stack references and
   * environmental context providers require concrete region information and
   * will cause this stack to emit synthesis errors.
   *
   * Default: Aws.ACCOUNT_ID which means that the stack will be account-agnostic.
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   * The AWS region for this environment.
   *
   * This can be either a concrete value such as `eu-west-2` or `Aws.REGION`
   * which indicates that account ID will only be determined during deployment
   * (it will resolve to the CloudFormation intrinsic `{"Ref":"AWS::Region"}`).
   * Note that certain features, such as cross-stack references and
   * environmental context providers require concrete region information and
   * will cause this stack to emit synthesis errors.
   *
   * Default: Aws.REGION which means that the stack will be region-agnostic.
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [Environment]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The AWS account ID for this environment.
     * This can be either a concrete value such as `585191031104` or `Aws.ACCOUNT_ID` which
     * indicates that account ID will only be determined during deployment (it
     * will resolve to the CloudFormation intrinsic `{"Ref":"AWS::AccountId"}`).
     * Note that certain features, such as cross-stack references and
     * environmental context providers require concrete region information and
     * will cause this stack to emit synthesis errors.
     */
    public fun account(account: String)

    /**
     * @param region The AWS region for this environment.
     * This can be either a concrete value such as `eu-west-2` or `Aws.REGION`
     * which indicates that account ID will only be determined during deployment
     * (it will resolve to the CloudFormation intrinsic `{"Ref":"AWS::Region"}`).
     * Note that certain features, such as cross-stack references and
     * environmental context providers require concrete region information and
     * will cause this stack to emit synthesis errors.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.Environment.Builder =
        software.amazon.awscdk.Environment.builder()

    /**
     * @param account The AWS account ID for this environment.
     * This can be either a concrete value such as `585191031104` or `Aws.ACCOUNT_ID` which
     * indicates that account ID will only be determined during deployment (it
     * will resolve to the CloudFormation intrinsic `{"Ref":"AWS::AccountId"}`).
     * Note that certain features, such as cross-stack references and
     * environmental context providers require concrete region information and
     * will cause this stack to emit synthesis errors.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param region The AWS region for this environment.
     * This can be either a concrete value such as `eu-west-2` or `Aws.REGION`
     * which indicates that account ID will only be determined during deployment
     * (it will resolve to the CloudFormation intrinsic `{"Ref":"AWS::Region"}`).
     * Note that certain features, such as cross-stack references and
     * environmental context providers require concrete region information and
     * will cause this stack to emit synthesis errors.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.Environment = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.Environment,
  ) : CdkObject(cdkObject),
      Environment {
    /**
     * The AWS account ID for this environment.
     *
     * This can be either a concrete value such as `585191031104` or `Aws.ACCOUNT_ID` which
     * indicates that account ID will only be determined during deployment (it
     * will resolve to the CloudFormation intrinsic `{"Ref":"AWS::AccountId"}`).
     * Note that certain features, such as cross-stack references and
     * environmental context providers require concrete region information and
     * will cause this stack to emit synthesis errors.
     *
     * Default: Aws.ACCOUNT_ID which means that the stack will be account-agnostic.
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * The AWS region for this environment.
     *
     * This can be either a concrete value such as `eu-west-2` or `Aws.REGION`
     * which indicates that account ID will only be determined during deployment
     * (it will resolve to the CloudFormation intrinsic `{"Ref":"AWS::Region"}`).
     * Note that certain features, such as cross-stack references and
     * environmental context providers require concrete region information and
     * will cause this stack to emit synthesis errors.
     *
     * Default: Aws.REGION which means that the stack will be region-agnostic.
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Environment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Environment): Environment =
        CdkObjectWrappers.wrap(cdkObject) as? Environment ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Environment): software.amazon.awscdk.Environment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.Environment
  }
}
