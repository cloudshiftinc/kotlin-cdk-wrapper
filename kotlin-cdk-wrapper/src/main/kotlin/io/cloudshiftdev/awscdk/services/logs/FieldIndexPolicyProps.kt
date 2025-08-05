@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for creating field index policies.
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
public interface FieldIndexPolicyProps {
  /**
   * List of fields to index in log events.
   *
   * Default: no fields
   */
  public fun fields(): List<String>

  /**
   * A builder for [FieldIndexPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fields List of fields to index in log events. 
     */
    public fun fields(fields: List<String>)

    /**
     * @param fields List of fields to index in log events. 
     */
    public fun fields(vararg fields: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.FieldIndexPolicyProps.Builder =
        software.amazon.awscdk.services.logs.FieldIndexPolicyProps.builder()

    /**
     * @param fields List of fields to index in log events. 
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * @param fields List of fields to index in log events. 
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    public fun build(): software.amazon.awscdk.services.logs.FieldIndexPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.FieldIndexPolicyProps,
  ) : CdkObject(cdkObject),
      FieldIndexPolicyProps {
    /**
     * List of fields to index in log events.
     *
     * Default: no fields
     */
    override fun fields(): List<String> = unwrap(this).getFields()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FieldIndexPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.FieldIndexPolicyProps):
        FieldIndexPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? FieldIndexPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FieldIndexPolicyProps):
        software.amazon.awscdk.services.logs.FieldIndexPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.FieldIndexPolicyProps
  }
}
