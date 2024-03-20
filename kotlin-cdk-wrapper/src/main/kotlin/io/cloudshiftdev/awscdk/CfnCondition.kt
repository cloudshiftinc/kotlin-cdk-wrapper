@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a CloudFormation condition, for resources which must be conditionally created and the
 * determination must be made at deploy time.
 *
 * Example:
 *
 * ```
 * CfnBucket rawBucket = CfnBucket.Builder.create(this, "Bucket").build();
 * // -or-
 * CfnBucket rawBucketAlt = (CfnBucket)myBucket.getNode().getDefaultChild();
 * // then
 * rawBucket.getCfnOptions().getCondition() = CfnCondition.Builder.create(this,
 * "EnableBucket").build();
 * rawBucket.getCfnOptions().getMetadata() = Map.of(
 * "metadataKey", "MetadataValue");
 * ```
 */
public open class CfnCondition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnCondition,
) : CfnElement(cdkObject), ICfnConditionExpression, IResolvable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.CfnCondition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConditionProps,
  ) : this(software.amazon.awscdk.CfnCondition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnConditionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConditionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConditionProps(props)
  )

  /**
   * The condition statement.
   */
  public open fun expression(): ICfnConditionExpression? =
      unwrap(this).getExpression()?.let(ICfnConditionExpression::wrap)

  /**
   * The condition statement.
   */
  public open fun expression(`value`: ICfnConditionExpression) {
    unwrap(this).setExpression(`value`.let(ICfnConditionExpression::unwrap))
  }

  /**
   * Synthesizes the condition.
   *
   * @param _context 
   */
  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext::unwrap))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnCondition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The expression that the condition will evaluate.
     *
     * Default: - None.
     *
     * @param expression The expression that the condition will evaluate. 
     */
    public fun expression(expression: ICfnConditionExpression)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCondition.Builder =
        software.amazon.awscdk.CfnCondition.Builder.create(scope, id)

    /**
     * The expression that the condition will evaluate.
     *
     * Default: - None.
     *
     * @param expression The expression that the condition will evaluate. 
     */
    override fun expression(expression: ICfnConditionExpression) {
      cdkBuilder.expression(expression.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnCondition = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCondition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCondition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCondition): CfnCondition =
        CfnCondition(cdkObject)

    internal fun unwrap(wrapped: CfnCondition): software.amazon.awscdk.CfnCondition =
        wrapped.cdkObject
  }
}
