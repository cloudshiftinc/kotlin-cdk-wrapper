@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

/**
 * A principal representing all AWS identities in all accounts.
 *
 * Some services behave differently when you specify `Principal: '*'`
 * or `Principal: { AWS: "*" }` in their resource policy.
 *
 * `AnyPrincipal` renders to `Principal: { AWS: "*" }`. This is correct
 * most of the time, but in cases where you need the other principal,
 * use `StarPrincipal` instead.
 *
 * Example:
 *
 * ```
 * Topic topic = new Topic(this, "Topic");
 * TopicPolicy topicPolicy = TopicPolicy.Builder.create(this, "TopicPolicy")
 * .topics(List.of(topic))
 * .build();
 * topicPolicy.document.addStatements(PolicyStatement.Builder.create()
 * .actions(List.of("sns:Subscribe"))
 * .principals(List.of(new AnyPrincipal()))
 * .resources(List.of(topic.getTopicArn()))
 * .build());
 * ```
 */
public open class AnyPrincipal(
  cdkObject: software.amazon.awscdk.services.iam.AnyPrincipal,
) : ArnPrincipal(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.iam.AnyPrincipal()
  )

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AnyPrincipal): AnyPrincipal =
        AnyPrincipal(cdkObject)

    internal fun unwrap(wrapped: AnyPrincipal): software.amazon.awscdk.services.iam.AnyPrincipal =
        wrapped.cdkObject as software.amazon.awscdk.services.iam.AnyPrincipal
  }
}
