@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Creates a field index policy for CloudWatch Logs log groups.
 *
 * Example:
 *
 * ```
 * FieldIndexPolicy fieldIndexPolicy = FieldIndexPolicy.Builder.create()
 * .fields(List.of("Operation", "RequestId"))
 * .build();
 * LogGroup.Builder.create(this, "LogGroup")
 * .logGroupName("cdkIntegLogGroup")
 * .fieldIndexPolicies(List.of(fieldIndexPolicy))
 * .build();
 * ```
 */
public open class FieldIndexPolicy(
  cdkObject: software.amazon.awscdk.services.logs.FieldIndexPolicy,
) : CdkObject(cdkObject) {
  public constructor(props: FieldIndexPolicyProps) :
      this(software.amazon.awscdk.services.logs.FieldIndexPolicy(props.let(FieldIndexPolicyProps.Companion::unwrap))
  )

  public constructor(props: FieldIndexPolicyProps.Builder.() -> Unit) :
      this(FieldIndexPolicyProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.FieldIndexPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * List of fields to index in log events.
     *
     * Default: no fields
     *
     * @param fields List of fields to index in log events. 
     */
    public fun fields(fields: List<String>)

    /**
     * List of fields to index in log events.
     *
     * Default: no fields
     *
     * @param fields List of fields to index in log events. 
     */
    public fun fields(vararg fields: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.FieldIndexPolicy.Builder =
        software.amazon.awscdk.services.logs.FieldIndexPolicy.Builder.create()

    /**
     * List of fields to index in log events.
     *
     * Default: no fields
     *
     * @param fields List of fields to index in log events. 
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * List of fields to index in log events.
     *
     * Default: no fields
     *
     * @param fields List of fields to index in log events. 
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    public fun build(): software.amazon.awscdk.services.logs.FieldIndexPolicy = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FieldIndexPolicy {
      val builderImpl = BuilderImpl()
      return FieldIndexPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.FieldIndexPolicy):
        FieldIndexPolicy = FieldIndexPolicy(cdkObject)

    internal fun unwrap(wrapped: FieldIndexPolicy):
        software.amazon.awscdk.services.logs.FieldIndexPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.FieldIndexPolicy
  }
}
