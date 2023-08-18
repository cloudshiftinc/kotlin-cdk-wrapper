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

package io.cloudshiftdev.awscdkdsl.services.ses.actions

import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.AddHeader
import software.amazon.awscdk.services.ses.actions.AddHeaderProps
import software.amazon.awscdk.services.ses.actions.Bounce
import software.amazon.awscdk.services.ses.actions.BounceProps
import software.amazon.awscdk.services.ses.actions.BounceTemplate
import software.amazon.awscdk.services.ses.actions.BounceTemplateProps
import software.amazon.awscdk.services.ses.actions.Lambda
import software.amazon.awscdk.services.ses.actions.LambdaProps
import software.amazon.awscdk.services.ses.actions.S3
import software.amazon.awscdk.services.ses.actions.S3Props
import software.amazon.awscdk.services.ses.actions.Sns
import software.amazon.awscdk.services.ses.actions.SnsProps
import software.amazon.awscdk.services.ses.actions.Stop
import software.amazon.awscdk.services.ses.actions.StopProps

public object actions {
    /**
     * Adds a header to the received email.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * Bucket bucket = new Bucket(this, "Bucket");
     * Topic topic = new Topic(this, "Topic");
     * ReceiptRuleSet.Builder.create(this, "RuleSet")
     * .rules(List.of(ReceiptRuleOptions.builder()
     * .recipients(List.of("hello&#64;aws.com"))
     * .actions(List.of(
     * AddHeader.Builder.create()
     * .name("X-Special-Header")
     * .value("aws")
     * .build(),
     * S3.Builder.create()
     * .bucket(bucket)
     * .objectKeyPrefix("emails/")
     * .topic(topic)
     * .build()))
     * .build(), ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .actions(List.of(
     * Sns.Builder.create()
     * .topic(topic)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun addHeader(block: AddHeaderDsl.() -> Unit = {}): AddHeader {
        val builder = AddHeaderDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a add header action.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * Bucket bucket = new Bucket(this, "Bucket");
     * Topic topic = new Topic(this, "Topic");
     * ReceiptRuleSet.Builder.create(this, "RuleSet")
     * .rules(List.of(ReceiptRuleOptions.builder()
     * .recipients(List.of("hello&#64;aws.com"))
     * .actions(List.of(
     * AddHeader.Builder.create()
     * .name("X-Special-Header")
     * .value("aws")
     * .build(),
     * S3.Builder.create()
     * .bucket(bucket)
     * .objectKeyPrefix("emails/")
     * .topic(topic)
     * .build()))
     * .build(), ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .actions(List.of(
     * Sns.Builder.create()
     * .topic(topic)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun addHeaderProps(block: AddHeaderPropsDsl.() -> Unit = {}): AddHeaderProps {
        val builder = AddHeaderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Rejects the received email by returning a bounce response to the sender and, optionally,
     * publishes a notification to Amazon SNS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.actions.*;
     * import software.amazon.awscdk.services.sns.*;
     * BounceTemplate bounceTemplate;
     * Topic topic;
     * Bounce bounce = Bounce.Builder.create()
     * .sender("sender")
     * .template(bounceTemplate)
     * // the properties below are optional
     * .topic(topic)
     * .build();
     * ```
     */
    public inline fun bounce(block: BounceDsl.() -> Unit = {}): Bounce {
        val builder = BounceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a bounce action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.actions.*;
     * import software.amazon.awscdk.services.sns.*;
     * BounceTemplate bounceTemplate;
     * Topic topic;
     * BounceProps bounceProps = BounceProps.builder()
     * .sender("sender")
     * .template(bounceTemplate)
     * // the properties below are optional
     * .topic(topic)
     * .build();
     * ```
     */
    public inline fun bounceProps(block: BouncePropsDsl.() -> Unit = {}): BounceProps {
        val builder = BouncePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A bounce template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.actions.*;
     * BounceTemplate bounceTemplate = BounceTemplate.MAILBOX_DOES_NOT_EXIST;
     * ```
     */
    public inline fun bounceTemplate(block: BounceTemplateDsl.() -> Unit = {}): BounceTemplate {
        val builder = BounceTemplateDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a BounceTemplate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.actions.*;
     * BounceTemplateProps bounceTemplateProps = BounceTemplateProps.builder()
     * .message("message")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .build();
     * ```
     */
    public inline fun bounceTemplateProps(
        block: BounceTemplatePropsDsl.() -> Unit = {}
    ): BounceTemplateProps {
        val builder = BounceTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * import software.amazon.awscdk.services.sns.*;
     * Function function_;
     * Topic topic;
     * Lambda lambda = Lambda.Builder.create()
     * .function(function_)
     * // the properties below are optional
     * .invocationType(LambdaInvocationType.EVENT)
     * .topic(topic)
     * .build();
     * ```
     */
    public inline fun lambda(block: LambdaDsl.() -> Unit = {}): Lambda {
        val builder = LambdaDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a Lambda action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * import software.amazon.awscdk.services.sns.*;
     * Function function_;
     * Topic topic;
     * LambdaProps lambdaProps = LambdaProps.builder()
     * .function(function_)
     * // the properties below are optional
     * .invocationType(LambdaInvocationType.EVENT)
     * .topic(topic)
     * .build();
     * ```
     */
    public inline fun lambdaProps(block: LambdaPropsDsl.() -> Unit = {}): LambdaProps {
        val builder = LambdaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Saves the received message to an Amazon S3 bucket and, optionally, publishes a notification
     * to Amazon SNS.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * Bucket bucket = new Bucket(this, "Bucket");
     * Topic topic = new Topic(this, "Topic");
     * ReceiptRuleSet.Builder.create(this, "RuleSet")
     * .rules(List.of(ReceiptRuleOptions.builder()
     * .recipients(List.of("hello&#64;aws.com"))
     * .actions(List.of(
     * AddHeader.Builder.create()
     * .name("X-Special-Header")
     * .value("aws")
     * .build(),
     * S3.Builder.create()
     * .bucket(bucket)
     * .objectKeyPrefix("emails/")
     * .topic(topic)
     * .build()))
     * .build(), ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .actions(List.of(
     * Sns.Builder.create()
     * .topic(topic)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun s3(block: S3Dsl.() -> Unit = {}): S3 {
        val builder = S3Dsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a S3 action.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * Bucket bucket = new Bucket(this, "Bucket");
     * Topic topic = new Topic(this, "Topic");
     * ReceiptRuleSet.Builder.create(this, "RuleSet")
     * .rules(List.of(ReceiptRuleOptions.builder()
     * .recipients(List.of("hello&#64;aws.com"))
     * .actions(List.of(
     * AddHeader.Builder.create()
     * .name("X-Special-Header")
     * .value("aws")
     * .build(),
     * S3.Builder.create()
     * .bucket(bucket)
     * .objectKeyPrefix("emails/")
     * .topic(topic)
     * .build()))
     * .build(), ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .actions(List.of(
     * Sns.Builder.create()
     * .topic(topic)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun s3Props(block: S3PropsDsl.() -> Unit = {}): S3Props {
        val builder = S3PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Publishes the email content within a notification to Amazon SNS.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * Bucket bucket = new Bucket(this, "Bucket");
     * Topic topic = new Topic(this, "Topic");
     * ReceiptRuleSet.Builder.create(this, "RuleSet")
     * .rules(List.of(ReceiptRuleOptions.builder()
     * .recipients(List.of("hello&#64;aws.com"))
     * .actions(List.of(
     * AddHeader.Builder.create()
     * .name("X-Special-Header")
     * .value("aws")
     * .build(),
     * S3.Builder.create()
     * .bucket(bucket)
     * .objectKeyPrefix("emails/")
     * .topic(topic)
     * .build()))
     * .build(), ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .actions(List.of(
     * Sns.Builder.create()
     * .topic(topic)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun sns(block: SnsDsl.() -> Unit = {}): Sns {
        val builder = SnsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a SNS action.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * Bucket bucket = new Bucket(this, "Bucket");
     * Topic topic = new Topic(this, "Topic");
     * ReceiptRuleSet.Builder.create(this, "RuleSet")
     * .rules(List.of(ReceiptRuleOptions.builder()
     * .recipients(List.of("hello&#64;aws.com"))
     * .actions(List.of(
     * AddHeader.Builder.create()
     * .name("X-Special-Header")
     * .value("aws")
     * .build(),
     * S3.Builder.create()
     * .bucket(bucket)
     * .objectKeyPrefix("emails/")
     * .topic(topic)
     * .build()))
     * .build(), ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .actions(List.of(
     * Sns.Builder.create()
     * .topic(topic)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun snsProps(block: SnsPropsDsl.() -> Unit = {}): SnsProps {
        val builder = SnsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Terminates the evaluation of the receipt rule set and optionally publishes a notification to
     * Amazon SNS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.actions.*;
     * import software.amazon.awscdk.services.sns.*;
     * Topic topic;
     * Stop stop = Stop.Builder.create()
     * .topic(topic)
     * .build();
     * ```
     */
    public inline fun stop(block: StopDsl.() -> Unit = {}): Stop {
        val builder = StopDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a stop action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.actions.*;
     * import software.amazon.awscdk.services.sns.*;
     * Topic topic;
     * StopProps stopProps = StopProps.builder()
     * .topic(topic)
     * .build();
     * ```
     */
    public inline fun stopProps(block: StopPropsDsl.() -> Unit = {}): StopProps {
        val builder = StopPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
