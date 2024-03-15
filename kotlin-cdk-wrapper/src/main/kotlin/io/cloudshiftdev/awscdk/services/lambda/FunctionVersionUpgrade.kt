@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.String

/**
 * Aspect for upgrading function versions when the provided feature flag is enabled.
 *
 * This can be necessary when the feature flag
 * changes the function hash, as such changes must be associated with a new
 * version. This aspect will change the function description in these cases,
 * which "validates" the new function hash.
 *
 * Example:
 *
 * ```
 * Stack stack = new Stack();
 * Aspects.of(stack).add(new FunctionVersionUpgrade(LAMBDA_RECOGNIZE_VERSION_PROPS));
 * ```
 */
public open class FunctionVersionUpgrade internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FunctionVersionUpgrade,
) : CdkObject(cdkObject), IAspect {
  public constructor(featureFlag: String, enabled: Boolean) :
      this(software.amazon.awscdk.services.lambda.FunctionVersionUpgrade(featureFlag, enabled))

  public constructor(featureFlag: String) :
      this(software.amazon.awscdk.services.lambda.FunctionVersionUpgrade(featureFlag))

  /**
   * All aspects can visit an IConstruct.
   *
   * @param node 
   */
  public override fun visit(node: IConstruct) {
    unwrap(this).visit(node.let(IConstruct::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionVersionUpgrade):
        FunctionVersionUpgrade = FunctionVersionUpgrade(cdkObject)

    internal fun unwrap(wrapped: FunctionVersionUpgrade):
        software.amazon.awscdk.services.lambda.FunctionVersionUpgrade = wrapped.cdkObject
  }
}
