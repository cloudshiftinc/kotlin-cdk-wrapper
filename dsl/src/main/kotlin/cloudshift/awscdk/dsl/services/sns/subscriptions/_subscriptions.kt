@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sns.subscriptions

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
import kotlin.String
import kotlin.Unit

public object subscriptions {
    public inline fun emailSubscription(
        emailAddress: String,
        block: EmailSubscriptionDsl.() -> Unit =
            {},
    ): EmailSubscription {
        val builder = EmailSubscriptionDsl(emailAddress)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emailSubscriptionProps(block: EmailSubscriptionPropsDsl.() -> Unit = {}): EmailSubscriptionProps {
        val builder = EmailSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaSubscription(fn: IFunction, block: LambdaSubscriptionDsl.() -> Unit = {}): LambdaSubscription {
        val builder = LambdaSubscriptionDsl(fn)
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaSubscriptionProps(block: LambdaSubscriptionPropsDsl.() -> Unit = {}): LambdaSubscriptionProps {
        val builder = LambdaSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun smsSubscription(phoneNumber: String, block: SmsSubscriptionDsl.() -> Unit = {}): SmsSubscription {
        val builder = SmsSubscriptionDsl(phoneNumber)
        builder.apply(block)
        return builder.build()
    }

    public inline fun smsSubscriptionProps(block: SmsSubscriptionPropsDsl.() -> Unit = {}): SmsSubscriptionProps {
        val builder = SmsSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqsSubscription(queue: IQueue, block: SqsSubscriptionDsl.() -> Unit = {}): SqsSubscription {
        val builder = SqsSubscriptionDsl(queue)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqsSubscriptionProps(block: SqsSubscriptionPropsDsl.() -> Unit = {}): SqsSubscriptionProps {
        val builder = SqsSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun subscriptionProps(block: SubscriptionPropsDsl.() -> Unit = {}): SubscriptionProps {
        val builder = SubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun urlSubscription(url: String, block: UrlSubscriptionDsl.() -> Unit = {}): UrlSubscription {
        val builder = UrlSubscriptionDsl(url)
        builder.apply(block)
        return builder.build()
    }

    public inline fun urlSubscriptionProps(block: UrlSubscriptionPropsDsl.() -> Unit = {}): UrlSubscriptionProps {
        val builder = UrlSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
