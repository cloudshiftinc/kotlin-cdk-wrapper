@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Captures a synthesis-time JSON object a CloudFormation reference which resolves during deployment
 * to the resolved values of the JSON object.
 *
 * The main use case for this is to overcome a limitation in CloudFormation that
 * does not allow using intrinsic functions as dictionary keys (because
 * dictionary keys in JSON must be strings). Specifically this is common in IAM
 * conditions such as `StringEquals: { lhs: "rhs" }` where you want "lhs" to be
 * a reference.
 *
 * This object is resolvable, so it can be used as a value.
 *
 * This construct is backed by a custom resource.
 *
 * Example:
 *
 * ```
 * CfnParameter tagParam = new CfnParameter(this, "TagName");
 * CfnJson stringEquals = CfnJson.Builder.create(this, "ConditionJson")
 * .value(Map.of(
 * String.format("aws:PrincipalTag/%s", tagParam.getValueAsString()), true))
 * .build();
 * PrincipalBase principal = new AccountRootPrincipal().withConditions(Map.of(
 * "StringEquals", stringEquals));
 * Role.Builder.create(this, "MyRole").assumedBy(principal).build();
 * ```
 */
public open class CfnJson(
  cdkObject: software.amazon.awscdk.CfnJson,
) : CloudshiftdevConstructsConstruct(cdkObject), IResolvable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJsonProps,
  ) : this(software.amazon.awscdk.CfnJson(scope.let(CloudshiftdevConstructsConstruct::unwrap), id,
      props.let(CfnJsonProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJsonProps.Builder.() -> Unit,
  ) : this(scope, id, CfnJsonProps(props)
  )

  /**
   * The creation stack of this resolvable which will be appended to errors thrown during
   * resolution.
   *
   * This may return an array with a single informational element indicating how
   * to get this property populated, if it was skipped for performance reasons.
   */
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  /**
   * Produce the Token's value at resolution time.
   *
   * @param _context 
   */
  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext::unwrap))

  /**
   * This is required in case someone JSON.stringifys an object which references this object.
   * Otherwise, we'll get a cyclic JSON reference.
   */
  public open fun toJSON(): String = unwrap(this).toJSON()

  /**
   * An Fn::GetAtt to the JSON object passed through `value` and resolved during synthesis.
   *
   * Normally there is no need to use this property since `CfnJson` is an
   * IResolvable, so it can be simply used as a value.
   */
  public open fun `value`(): Reference = unwrap(this).getValue().let(Reference::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnJson].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The value to resolve.
     *
     * Can be any JavaScript object, including tokens and
     * references in keys or values.
     *
     * @param value The value to resolve. 
     */
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnJson.Builder =
        software.amazon.awscdk.CfnJson.Builder.create(scope, id)

    /**
     * The value to resolve.
     *
     * Can be any JavaScript object, including tokens and
     * references in keys or values.
     *
     * @param value The value to resolve. 
     */
    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnJson = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJson {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJson(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnJson): CfnJson = CfnJson(cdkObject)

    internal fun unwrap(wrapped: CfnJson): software.amazon.awscdk.CfnJson = wrapped.cdkObject as
        software.amazon.awscdk.CfnJson
  }
}
