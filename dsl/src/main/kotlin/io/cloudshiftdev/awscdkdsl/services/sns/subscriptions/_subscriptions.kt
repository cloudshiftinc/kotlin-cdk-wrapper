@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sns.subscriptions

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscription
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscriptionProps
import software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription
import software.amazon.awscdk.services.sns.subscriptions.LambdaSubscriptionProps
import software.amazon.awscdk.services.sns.subscriptions.SmsSubscription
import software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscription
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscriptionProps
import software.amazon.awscdk.services.sns.subscriptions.SubscriptionProps
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscription
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps
import software.amazon.awscdk.services.sqs.IQueue

public object subscriptions {
    /**
     * Use an email address as a subscription target.
     *
     * Email subscriptions require confirmation.
     *
     * Example:
     * ```
     * Topic myTopic = new Topic(this, "Topic");
     * CfnParameter emailAddress = new CfnParameter(this, "email-param");
     * myTopic.addSubscription(new EmailSubscription(emailAddress.getValueAsString()));
     * ```
     */
    public inline fun emailSubscription(
        emailAddress: String,
        block: EmailSubscriptionDsl.() -> Unit = {}
    ): EmailSubscription {
        val builder = EmailSubscriptionDsl(emailAddress)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for email subscriptions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sns.subscriptions.*;
     * import software.amazon.awscdk.services.sqs.*;
     * FilterOrPolicy filterOrPolicy;
     * Queue queue;
     * SubscriptionFilter subscriptionFilter;
     * EmailSubscriptionProps emailSubscriptionProps = EmailSubscriptionProps.builder()
     * .deadLetterQueue(queue)
     * .filterPolicy(Map.of(
     * "filterPolicyKey", subscriptionFilter))
     * .filterPolicyWithMessageBody(Map.of(
     * "filterPolicyWithMessageBodyKey", filterOrPolicy))
     * .json(false)
     * .build();
     * ```
     */
    public inline fun emailSubscriptionProps(
        block: EmailSubscriptionPropsDsl.() -> Unit = {}
    ): EmailSubscriptionProps {
        val builder = EmailSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use a Lambda function as a subscription target.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function fn;
     * Topic myTopic = new Topic(this, "MyTopic");
     * // Lambda should receive only message matching the following conditions on message body:
     * // color: 'red' or 'orange'
     * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
     * .filterPolicyWithMessageBody(Map.of(
     * "background", FilterOrPolicy.policy(Map.of(
     * "color", FilterOrPolicy.filter(SubscriptionFilter.stringFilter(StringConditions.builder()
     * .allowlist(List.of("red", "orange"))
     * .build()))))))
     * .build());
     * ```
     */
    public inline fun lambdaSubscription(
        fn: IFunction,
        block: LambdaSubscriptionDsl.() -> Unit = {}
    ): LambdaSubscription {
        val builder = LambdaSubscriptionDsl(fn)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Lambda subscription.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function fn;
     * Topic myTopic = new Topic(this, "MyTopic");
     * // Lambda should receive only message matching the following conditions on attributes:
     * // color: 'red' or 'orange' or begins with 'bl'
     * // size: anything but 'small' or 'medium'
     * // price: between 100 and 200 or greater than 300
     * // store: attribute must be present
     * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
     * .filterPolicy(Map.of(
     * "color", SubscriptionFilter.stringFilter(StringConditions.builder()
     * .allowlist(List.of("red", "orange"))
     * .matchPrefixes(List.of("bl"))
     * .build()),
     * "size", SubscriptionFilter.stringFilter(StringConditions.builder()
     * .denylist(List.of("small", "medium"))
     * .build()),
     * "price", SubscriptionFilter.numericFilter(NumericConditions.builder()
     * .between(BetweenCondition.builder().start(100).stop(200).build())
     * .greaterThan(300)
     * .build()),
     * "store", SubscriptionFilter.existsFilter()))
     * .build());
     * ```
     */
    public inline fun lambdaSubscriptionProps(
        block: LambdaSubscriptionPropsDsl.() -> Unit = {}
    ): LambdaSubscriptionProps {
        val builder = LambdaSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an sms address as a subscription target.
     *
     * Example:
     * ```
     * Topic myTopic = new Topic(this, "Topic");
     * myTopic.addSubscription(new SmsSubscription("+15551231234"));
     * ```
     */
    public inline fun smsSubscription(
        phoneNumber: String,
        block: SmsSubscriptionDsl.() -> Unit = {}
    ): SmsSubscription {
        val builder = SmsSubscriptionDsl(phoneNumber)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for SMS subscriptions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sns.subscriptions.*;
     * import software.amazon.awscdk.services.sqs.*;
     * FilterOrPolicy filterOrPolicy;
     * Queue queue;
     * SubscriptionFilter subscriptionFilter;
     * SmsSubscriptionProps smsSubscriptionProps = SmsSubscriptionProps.builder()
     * .deadLetterQueue(queue)
     * .filterPolicy(Map.of(
     * "filterPolicyKey", subscriptionFilter))
     * .filterPolicyWithMessageBody(Map.of(
     * "filterPolicyWithMessageBodyKey", filterOrPolicy))
     * .build();
     * ```
     */
    public inline fun smsSubscriptionProps(
        block: SmsSubscriptionPropsDsl.() -> Unit = {}
    ): SmsSubscriptionProps {
        val builder = SmsSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an SQS queue as a subscription target.
     *
     * Example:
     * ```
     * Queue queue;
     * Topic myTopic = new Topic(this, "MyTopic");
     * myTopic.addSubscription(new SqsSubscription(queue));
     * ```
     */
    public inline fun sqsSubscription(
        queue: IQueue,
        block: SqsSubscriptionDsl.() -> Unit = {}
    ): SqsSubscription {
        val builder = SqsSubscriptionDsl(queue)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an SQS subscription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sns.subscriptions.*;
     * import software.amazon.awscdk.services.sqs.*;
     * FilterOrPolicy filterOrPolicy;
     * Queue queue;
     * SubscriptionFilter subscriptionFilter;
     * SqsSubscriptionProps sqsSubscriptionProps = SqsSubscriptionProps.builder()
     * .deadLetterQueue(queue)
     * .filterPolicy(Map.of(
     * "filterPolicyKey", subscriptionFilter))
     * .filterPolicyWithMessageBody(Map.of(
     * "filterPolicyWithMessageBodyKey", filterOrPolicy))
     * .rawMessageDelivery(false)
     * .build();
     * ```
     */
    public inline fun sqsSubscriptionProps(
        block: SqsSubscriptionPropsDsl.() -> Unit = {}
    ): SqsSubscriptionProps {
        val builder = SqsSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to subscribing to an SNS topic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sns.subscriptions.*;
     * import software.amazon.awscdk.services.sqs.*;
     * FilterOrPolicy filterOrPolicy;
     * Queue queue;
     * SubscriptionFilter subscriptionFilter;
     * SubscriptionProps subscriptionProps = SubscriptionProps.builder()
     * .deadLetterQueue(queue)
     * .filterPolicy(Map.of(
     * "filterPolicyKey", subscriptionFilter))
     * .filterPolicyWithMessageBody(Map.of(
     * "filterPolicyWithMessageBodyKey", filterOrPolicy))
     * .build();
     * ```
     */
    public inline fun subscriptionProps(
        block: SubscriptionPropsDsl.() -> Unit = {}
    ): SubscriptionProps {
        val builder = SubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use a URL as a subscription target.
     *
     * The message will be POSTed to the given URL.
     *
     * Example:
     * ```
     * Topic myTopic = new Topic(this, "MyTopic");
     * myTopic.addSubscription(new UrlSubscription("https://foobar.com/"));
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-http-https-endpoint-as-subscriber.html)
     */
    public inline fun urlSubscription(
        url: String,
        block: UrlSubscriptionDsl.() -> Unit = {}
    ): UrlSubscription {
        val builder = UrlSubscriptionDsl(url)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for URL subscriptions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sns.subscriptions.*;
     * import software.amazon.awscdk.services.sqs.*;
     * FilterOrPolicy filterOrPolicy;
     * Queue queue;
     * SubscriptionFilter subscriptionFilter;
     * UrlSubscriptionProps urlSubscriptionProps = UrlSubscriptionProps.builder()
     * .deadLetterQueue(queue)
     * .filterPolicy(Map.of(
     * "filterPolicyKey", subscriptionFilter))
     * .filterPolicyWithMessageBody(Map.of(
     * "filterPolicyWithMessageBodyKey", filterOrPolicy))
     * .protocol(SubscriptionProtocol.HTTP)
     * .rawMessageDelivery(false)
     * .build();
     * ```
     */
    public inline fun urlSubscriptionProps(
        block: UrlSubscriptionPropsDsl.() -> Unit = {}
    ): UrlSubscriptionProps {
        val builder = UrlSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
