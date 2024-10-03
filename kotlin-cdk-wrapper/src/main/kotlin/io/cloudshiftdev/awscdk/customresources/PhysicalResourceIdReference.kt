@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.IResolveContext
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * Reference to the physical resource id that can be passed to the AWS operation as a parameter.
 *
 * Example:
 *
 * ```
 * AwsCustomResource awsCustom = AwsCustomResource.Builder.create(this, "aws-custom")
 * .onCreate(AwsSdkCall.builder()
 * .service("...")
 * .action("...")
 * .parameters(Map.of(
 * "text", "..."))
 * .physicalResourceId(PhysicalResourceId.of("..."))
 * .build())
 * .onUpdate(AwsSdkCall.builder()
 * .service("...")
 * .action("...")
 * .parameters(Map.of(
 * "text", "...",
 * "resourceId", new PhysicalResourceIdReference()))
 * .build())
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * ```
 */
public open class PhysicalResourceIdReference(
  cdkObject: software.amazon.awscdk.customresources.PhysicalResourceIdReference,
) : CdkObject(cdkObject),
    IResolvable {
  public constructor() : this(software.amazon.awscdk.customresources.PhysicalResourceIdReference()
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
      unwrap(this).resolve(context.let(IResolveContext.Companion::unwrap))

  /**
   * toJSON serialization to replace `PhysicalResourceIdReference` with a magic string.
   */
  public open fun toJSON(): String = unwrap(this).toJSON()

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.customresources.PhysicalResourceIdReference):
        PhysicalResourceIdReference = PhysicalResourceIdReference(cdkObject)

    internal fun unwrap(wrapped: PhysicalResourceIdReference):
        software.amazon.awscdk.customresources.PhysicalResourceIdReference = wrapped.cdkObject as
        software.amazon.awscdk.customresources.PhysicalResourceIdReference
  }
}
