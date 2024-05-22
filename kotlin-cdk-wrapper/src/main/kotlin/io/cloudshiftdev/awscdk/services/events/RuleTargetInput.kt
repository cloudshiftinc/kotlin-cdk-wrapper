@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String

/**
 * The input to send to the event target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .definition(Definition.fromFile("schema.graphql"))
 * .authorizationConfig(AuthorizationConfig.builder()
 * .defaultAuthorization(AuthorizationMode.builder().authorizationType(AuthorizationType.IAM).build())
 * .build())
 * .build();
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(AppSync.Builder.create(api)
 * .graphQLOperation("mutation Publish($message: String!){ publish(message: $message) { message }
 * }")
 * .variables(RuleTargetInput.fromObject(Map.of(
 * "message", "hello world")))
 * .build());
 * ```
 */
public abstract class RuleTargetInput(
  cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
) : CdkObject(cdkObject) {
  /**
   * Return the input properties for this input object.
   *
   * @param rule 
   */
  public open fun bind(rule: IRule): RuleTargetInputProperties =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetInputProperties::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
  ) : RuleTargetInput(cdkObject)

  public companion object {
    public fun fromEventPath(path: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromEventPath(path).let(RuleTargetInput::wrap)

    public fun fromMultilineText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromMultilineText(text).let(RuleTargetInput::wrap)

    public fun fromObject(obj: Any): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromObject(obj).let(RuleTargetInput::wrap)

    public fun fromText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromText(text).let(RuleTargetInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetInput):
        RuleTargetInput = CdkObjectWrappers.wrap(cdkObject) as? RuleTargetInput ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetInput):
        software.amazon.awscdk.services.events.RuleTargetInput = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.RuleTargetInput
  }
}
