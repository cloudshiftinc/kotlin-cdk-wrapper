package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface EventPattern {
    /**
     * The 12-digit number identifying an AWS account.
     *
     * Default: - No filtering on account
     */
    public fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

    /**
     * A JSON object, whose content is at the discretion of the service originating the event.
     *
     * Default: - No filtering on detail
     */
    public fun detail(): Map<String, Any> = unwrap(this).getDetail() ?: emptyMap()

    /**
     * Identifies, in combination with the source field, the fields and values that appear in the
     * detail field.
     *
     * Represents the "detail-type" event field.
     *
     * Default: - No filtering on detail type
     */
    public fun detailType(): List<String> = unwrap(this).getDetailType() ?: emptyList()

    /**
     * A unique value is generated for every event.
     *
     * This can be helpful in tracing events as they move through rules to targets, and are
     * processed.
     *
     * Default: - No filtering on id
     */
    public fun id(): List<String> = unwrap(this).getId() ?: emptyList()

    /**
     * Identifies the AWS region where the event originated.
     *
     * Default: - No filtering on region
     */
    public fun region(): List<String> = unwrap(this).getRegion() ?: emptyList()

    /**
     * This JSON array contains ARNs that identify resources that are involved in the event.
     *
     * Inclusion of these ARNs is at the discretion of the service.
     *
     * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto Scaling
     * events include ARNs for both instances and Auto Scaling groups, but API calls with AWS
     * CloudTrail do not include resource ARNs.
     *
     * Default: - No filtering on resource
     */
    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * Identifies the service that sourced the event.
     *
     * All events sourced from within AWS begin with "aws." Customer-generated events can have any
     * value here, as long as it doesn't begin with "aws." We recommend the use of Java package-name
     * style reverse domain-name strings.
     *
     * To find the correct value for source for an AWS service, see the table in AWS Service
     * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
     *
     * Default: - No filtering on source
     *
     * [Documentation](http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces)
     */
    public fun source(): List<String> = unwrap(this).getSource() ?: emptyList()

    /**
     * The event timestamp, which can be specified by the service originating the event.
     *
     * If the event spans a time interval, the service might choose to report the start time, so
     * this value can be noticeably before the time the event is actually received.
     *
     * Default: - No filtering on time
     */
    public fun time(): List<String> = unwrap(this).getTime() ?: emptyList()

    /**
     * By default, this is set to 0 (zero) in all events.
     *
     * Default: - No filtering on version
     */
    public fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()

    /** A builder for [EventPattern] */
    @CdkDslMarker
    public interface Builder {
        /** @param account The 12-digit number identifying an AWS account. */
        public fun account(account: List<String>)

        /** @param account The 12-digit number identifying an AWS account. */
        public fun account(vararg account: String)

        /**
         * @param detail A JSON object, whose content is at the discretion of the service
         *   originating the event.
         */
        public fun detail(detail: Map<String, Any>)

        /**
         * @param detailType Identifies, in combination with the source field, the fields and values
         *   that appear in the detail field. Represents the "detail-type" event field.
         */
        public fun detailType(detailType: List<String>)

        /**
         * @param detailType Identifies, in combination with the source field, the fields and values
         *   that appear in the detail field. Represents the "detail-type" event field.
         */
        public fun detailType(vararg detailType: String)

        /**
         * @param id A unique value is generated for every event. This can be helpful in tracing
         *   events as they move through rules to targets, and are processed.
         */
        public fun id(id: List<String>)

        /**
         * @param id A unique value is generated for every event. This can be helpful in tracing
         *   events as they move through rules to targets, and are processed.
         */
        public fun id(vararg id: String)

        /** @param region Identifies the AWS region where the event originated. */
        public fun region(region: List<String>)

        /** @param region Identifies the AWS region where the event originated. */
        public fun region(vararg region: String)

        /**
         * @param resources This JSON array contains ARNs that identify resources that are involved
         *   in the event. Inclusion of these ARNs is at the discretion of the service.
         *
         * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto
         * Scaling events include ARNs for both instances and Auto Scaling groups, but API calls
         * with AWS CloudTrail do not include resource ARNs.
         */
        public fun resources(resources: List<String>)

        /**
         * @param resources This JSON array contains ARNs that identify resources that are involved
         *   in the event. Inclusion of these ARNs is at the discretion of the service.
         *
         * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto
         * Scaling events include ARNs for both instances and Auto Scaling groups, but API calls
         * with AWS CloudTrail do not include resource ARNs.
         */
        public fun resources(vararg resources: String)

        /**
         * @param source Identifies the service that sourced the event. All events sourced from
         *   within AWS begin with "aws." Customer-generated events can have any value here, as long
         *   as it doesn't begin with "aws." We recommend the use of Java package-name style reverse
         *   domain-name strings.
         *
         * To find the correct value for source for an AWS service, see the table in AWS Service
         * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
         */
        public fun source(source: List<String>)

        /**
         * @param source Identifies the service that sourced the event. All events sourced from
         *   within AWS begin with "aws." Customer-generated events can have any value here, as long
         *   as it doesn't begin with "aws." We recommend the use of Java package-name style reverse
         *   domain-name strings.
         *
         * To find the correct value for source for an AWS service, see the table in AWS Service
         * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
         */
        public fun source(vararg source: String)

        /**
         * @param time The event timestamp, which can be specified by the service originating the
         *   event. If the event spans a time interval, the service might choose to report the start
         *   time, so this value can be noticeably before the time the event is actually received.
         */
        public fun time(time: List<String>)

        /**
         * @param time The event timestamp, which can be specified by the service originating the
         *   event. If the event spans a time interval, the service might choose to report the start
         *   time, so this value can be noticeably before the time the event is actually received.
         */
        public fun time(vararg time: String)

        /** @param version By default, this is set to 0 (zero) in all events. */
        public fun version(version: List<String>)

        /** @param version By default, this is set to 0 (zero) in all events. */
        public fun version(vararg version: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.events.EventPattern.Builder =
            software.amazon.awscdk.services.events.EventPattern.builder()

        /** @param account The 12-digit number identifying an AWS account. */
        override fun account(account: List<String>) {
            cdkBuilder.account(account)
        }

        /** @param account The 12-digit number identifying an AWS account. */
        override fun account(vararg account: String): Unit = account(account.toList())

        /**
         * @param detail A JSON object, whose content is at the discretion of the service
         *   originating the event.
         */
        override fun detail(detail: Map<String, Any>) {
            cdkBuilder.detail(detail)
        }

        /**
         * @param detailType Identifies, in combination with the source field, the fields and values
         *   that appear in the detail field. Represents the "detail-type" event field.
         */
        override fun detailType(detailType: List<String>) {
            cdkBuilder.detailType(detailType)
        }

        /**
         * @param detailType Identifies, in combination with the source field, the fields and values
         *   that appear in the detail field. Represents the "detail-type" event field.
         */
        override fun detailType(vararg detailType: String): Unit = detailType(detailType.toList())

        /**
         * @param id A unique value is generated for every event. This can be helpful in tracing
         *   events as they move through rules to targets, and are processed.
         */
        override fun id(id: List<String>) {
            cdkBuilder.id(id)
        }

        /**
         * @param id A unique value is generated for every event. This can be helpful in tracing
         *   events as they move through rules to targets, and are processed.
         */
        override fun id(vararg id: String): Unit = id(id.toList())

        /** @param region Identifies the AWS region where the event originated. */
        override fun region(region: List<String>) {
            cdkBuilder.region(region)
        }

        /** @param region Identifies the AWS region where the event originated. */
        override fun region(vararg region: String): Unit = region(region.toList())

        /**
         * @param resources This JSON array contains ARNs that identify resources that are involved
         *   in the event. Inclusion of these ARNs is at the discretion of the service.
         *
         * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto
         * Scaling events include ARNs for both instances and Auto Scaling groups, but API calls
         * with AWS CloudTrail do not include resource ARNs.
         */
        override fun resources(resources: List<String>) {
            cdkBuilder.resources(resources)
        }

        /**
         * @param resources This JSON array contains ARNs that identify resources that are involved
         *   in the event. Inclusion of these ARNs is at the discretion of the service.
         *
         * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto
         * Scaling events include ARNs for both instances and Auto Scaling groups, but API calls
         * with AWS CloudTrail do not include resource ARNs.
         */
        override fun resources(vararg resources: String): Unit = resources(resources.toList())

        /**
         * @param source Identifies the service that sourced the event. All events sourced from
         *   within AWS begin with "aws." Customer-generated events can have any value here, as long
         *   as it doesn't begin with "aws." We recommend the use of Java package-name style reverse
         *   domain-name strings.
         *
         * To find the correct value for source for an AWS service, see the table in AWS Service
         * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
         */
        override fun source(source: List<String>) {
            cdkBuilder.source(source)
        }

        /**
         * @param source Identifies the service that sourced the event. All events sourced from
         *   within AWS begin with "aws." Customer-generated events can have any value here, as long
         *   as it doesn't begin with "aws." We recommend the use of Java package-name style reverse
         *   domain-name strings.
         *
         * To find the correct value for source for an AWS service, see the table in AWS Service
         * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
         */
        override fun source(vararg source: String): Unit = source(source.toList())

        /**
         * @param time The event timestamp, which can be specified by the service originating the
         *   event. If the event spans a time interval, the service might choose to report the start
         *   time, so this value can be noticeably before the time the event is actually received.
         */
        override fun time(time: List<String>) {
            cdkBuilder.time(time)
        }

        /**
         * @param time The event timestamp, which can be specified by the service originating the
         *   event. If the event spans a time interval, the service might choose to report the start
         *   time, so this value can be noticeably before the time the event is actually received.
         */
        override fun time(vararg time: String): Unit = time(time.toList())

        /** @param version By default, this is set to 0 (zero) in all events. */
        override fun version(version: List<String>) {
            cdkBuilder.version(version)
        }

        /** @param version By default, this is set to 0 (zero) in all events. */
        override fun version(vararg version: String): Unit = version(version.toList())

        public fun build(): software.amazon.awscdk.services.events.EventPattern = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.events.EventPattern,
    ) : EventPattern {
        /**
         * The 12-digit number identifying an AWS account.
         *
         * Default: - No filtering on account
         */
        override fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

        /**
         * A JSON object, whose content is at the discretion of the service originating the event.
         *
         * Default: - No filtering on detail
         */
        override fun detail(): Map<String, Any> = unwrap(this).getDetail() ?: emptyMap()

        /**
         * Identifies, in combination with the source field, the fields and values that appear in
         * the detail field.
         *
         * Represents the "detail-type" event field.
         *
         * Default: - No filtering on detail type
         */
        override fun detailType(): List<String> = unwrap(this).getDetailType() ?: emptyList()

        /**
         * A unique value is generated for every event.
         *
         * This can be helpful in tracing events as they move through rules to targets, and are
         * processed.
         *
         * Default: - No filtering on id
         */
        override fun id(): List<String> = unwrap(this).getId() ?: emptyList()

        /**
         * Identifies the AWS region where the event originated.
         *
         * Default: - No filtering on region
         */
        override fun region(): List<String> = unwrap(this).getRegion() ?: emptyList()

        /**
         * This JSON array contains ARNs that identify resources that are involved in the event.
         *
         * Inclusion of these ARNs is at the discretion of the service.
         *
         * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto
         * Scaling events include ARNs for both instances and Auto Scaling groups, but API calls
         * with AWS CloudTrail do not include resource ARNs.
         *
         * Default: - No filtering on resource
         */
        override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

        /**
         * Identifies the service that sourced the event.
         *
         * All events sourced from within AWS begin with "aws." Customer-generated events can have
         * any value here, as long as it doesn't begin with "aws." We recommend the use of Java
         * package-name style reverse domain-name strings.
         *
         * To find the correct value for source for an AWS service, see the table in AWS Service
         * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
         *
         * Default: - No filtering on source
         *
         * [Documentation](http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces)
         */
        override fun source(): List<String> = unwrap(this).getSource() ?: emptyList()

        /**
         * The event timestamp, which can be specified by the service originating the event.
         *
         * If the event spans a time interval, the service might choose to report the start time, so
         * this value can be noticeably before the time the event is actually received.
         *
         * Default: - No filtering on time
         */
        override fun time(): List<String> = unwrap(this).getTime() ?: emptyList()

        /**
         * By default, this is set to 0 (zero) in all events.
         *
         * Default: - No filtering on version
         */
        override fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): EventPattern {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.events.EventPattern
        ): EventPattern = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: EventPattern
        ): software.amazon.awscdk.services.events.EventPattern = (wrapped as Wrapper).cdkObject
    }
}
