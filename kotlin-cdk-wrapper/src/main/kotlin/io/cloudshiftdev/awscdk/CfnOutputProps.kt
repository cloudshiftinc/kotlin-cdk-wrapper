@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * Cluster cluster;
 * // add service account
 * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
 * Bucket bucket = new Bucket(this, "Bucket");
 * bucket.grantReadWrite(serviceAccount);
 * KubernetesManifest mypod = cluster.addManifest("mypod", Map.of(
 * "apiVersion", "v1",
 * "kind", "Pod",
 * "metadata", Map.of("name", "mypod"),
 * "spec", Map.of(
 * "serviceAccountName", serviceAccount.getServiceAccountName(),
 * "containers", List.of(Map.of(
 * "name", "hello",
 * "image", "paulbouwer/hello-kubernetes:1.5",
 * "ports", List.of(Map.of("containerPort", 8080)))))));
 * // create the resource after the service account.
 * mypod.node.addDependency(serviceAccount);
 * // print the IAM role arn for this service account
 * // print the IAM role arn for this service account
 * CfnOutput.Builder.create(this,
 * "ServiceAccountIamRole").value(serviceAccount.getRole().getRoleArn()).build();
 * ```
 */
public interface CfnOutputProps {
  /**
   * A condition to associate with this output value.
   *
   * If the condition evaluates
   * to `false`, this output value will not be included in the stack.
   *
   * Default: - No condition is associated with the output.
   */
  public fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

  /**
   * A String type that describes the output value.
   *
   * The description can be a maximum of 4 K in length.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name used to export the value of this output across stacks.
   *
   * To import the value from another stack, use `Fn.importValue(exportName)`.
   *
   * Default: - the output is not exported
   */
  public fun exportName(): String? = unwrap(this).getExportName()

  /**
   * The key of the property returned by aws cloudformation describe-stacks command.
   */
  public fun key(): String? = unwrap(this).getKey()

  /**
   * The value of the property returned by the aws cloudformation describe-stacks command.
   *
   * The value of an output can include literals, parameter references, pseudo-parameters,
   * a mapping value, or intrinsic functions.
   */
  public fun `value`(): String

  /**
   * A builder for [CfnOutputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param condition A condition to associate with this output value.
     * If the condition evaluates
     * to `false`, this output value will not be included in the stack.
     */
    public fun condition(condition: CfnCondition)

    /**
     * @param description A String type that describes the output value.
     * The description can be a maximum of 4 K in length.
     */
    public fun description(description: String)

    /**
     * @param exportName The name used to export the value of this output across stacks.
     * To import the value from another stack, use `Fn.importValue(exportName)`.
     */
    public fun exportName(exportName: String)

    /**
     * @param key The key of the property returned by aws cloudformation describe-stacks command.
     */
    public fun key(key: String)

    /**
     * @param value The value of the property returned by the aws cloudformation describe-stacks
     * command. 
     * The value of an output can include literals, parameter references, pseudo-parameters,
     * a mapping value, or intrinsic functions.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnOutputProps.Builder =
        software.amazon.awscdk.CfnOutputProps.builder()

    /**
     * @param condition A condition to associate with this output value.
     * If the condition evaluates
     * to `false`, this output value will not be included in the stack.
     */
    override fun condition(condition: CfnCondition) {
      cdkBuilder.condition(condition.let(CfnCondition::unwrap))
    }

    /**
     * @param description A String type that describes the output value.
     * The description can be a maximum of 4 K in length.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param exportName The name used to export the value of this output across stacks.
     * To import the value from another stack, use `Fn.importValue(exportName)`.
     */
    override fun exportName(exportName: String) {
      cdkBuilder.exportName(exportName)
    }

    /**
     * @param key The key of the property returned by aws cloudformation describe-stacks command.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value The value of the property returned by the aws cloudformation describe-stacks
     * command. 
     * The value of an output can include literals, parameter references, pseudo-parameters,
     * a mapping value, or intrinsic functions.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnOutputProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnOutputProps,
  ) : CdkObject(cdkObject), CfnOutputProps {
    /**
     * A condition to associate with this output value.
     *
     * If the condition evaluates
     * to `false`, this output value will not be included in the stack.
     *
     * Default: - No condition is associated with the output.
     */
    override fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

    /**
     * A String type that describes the output value.
     *
     * The description can be a maximum of 4 K in length.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name used to export the value of this output across stacks.
     *
     * To import the value from another stack, use `Fn.importValue(exportName)`.
     *
     * Default: - the output is not exported
     */
    override fun exportName(): String? = unwrap(this).getExportName()

    /**
     * The key of the property returned by aws cloudformation describe-stacks command.
     */
    override fun key(): String? = unwrap(this).getKey()

    /**
     * The value of the property returned by the aws cloudformation describe-stacks command.
     *
     * The value of an output can include literals, parameter references, pseudo-parameters,
     * a mapping value, or intrinsic functions.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnOutputProps): CfnOutputProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnOutputProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOutputProps): software.amazon.awscdk.CfnOutputProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.CfnOutputProps
  }
}
