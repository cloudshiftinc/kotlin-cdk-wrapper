package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LifecycleRule {
    /**
     * Describes the purpose of the rule.
     *
     * Default: No description
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The maximum age of images to retain. The value must represent a number of days.
     *
     * Specify exactly one of maxImageCount and maxImageAge.
     */
    public fun maxImageAge(): Duration? = unwrap(this).getMaxImageAge()?.let(Duration::wrap)

    /**
     * The maximum number of images to retain.
     *
     * Specify exactly one of maxImageCount and maxImageAge.
     */
    public fun maxImageCount(): Number? = unwrap(this).getMaxImageCount()

    /**
     * Controls the order in which rules are evaluated (low to high).
     *
     * All rules must have a unique priority, where lower numbers have higher precedence. The first
     * rule that matches is applied to an image.
     *
     * There can only be one rule with a tagStatus of Any, and it must have the highest
     * rulePriority.
     *
     * All rules without a specified priority will have incrementing priorities automatically
     * assigned to them, higher than any rules that DO have priorities.
     *
     * Default: Automatically assigned
     */
    public fun rulePriority(): Number? = unwrap(this).getRulePriority()

    /**
     * Select images that have ALL the given patterns in their tag.
     *
     * There is a maximum limit of four wildcards (*) per string. For example,
     * ["*test*1*2*3", "test*1*2*3*"] is valid but ["test*1*2*3*4*5*6"] is invalid.
     *
     * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
     *
     * Only if tagStatus == TagStatus.Tagged
     */
    public fun tagPatternList(): List<String> = unwrap(this).getTagPatternList() ?: emptyList()

    /**
     * Select images that have ALL the given prefixes in their tag.
     *
     * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
     *
     * Only if tagStatus == TagStatus.Tagged
     */
    public fun tagPrefixList(): List<String> = unwrap(this).getTagPrefixList() ?: emptyList()

    /**
     * Select images based on tags.
     *
     * Only one rule is allowed to select untagged images, and it must have the highest
     * rulePriority.
     *
     * Default: TagStatus.Tagged if tagPrefixList or tagPatternList is given, TagStatus.Any
     * otherwise
     */
    public fun tagStatus(): TagStatus? = unwrap(this).getTagStatus()?.let(TagStatus::wrap)

    /** A builder for [LifecycleRule] */
    @CdkDslMarker
    public interface Builder {
        /** @param description Describes the purpose of the rule. */
        public fun description(description: String)

        /**
         * @param maxImageAge The maximum age of images to retain. The value must represent a number
         *   of days. Specify exactly one of maxImageCount and maxImageAge.
         */
        public fun maxImageAge(maxImageAge: Duration)

        /**
         * @param maxImageCount The maximum number of images to retain. Specify exactly one of
         *   maxImageCount and maxImageAge.
         */
        public fun maxImageCount(maxImageCount: Number)

        /**
         * @param rulePriority Controls the order in which rules are evaluated (low to high). All
         *   rules must have a unique priority, where lower numbers have higher precedence. The
         *   first rule that matches is applied to an image.
         *
         * There can only be one rule with a tagStatus of Any, and it must have the highest
         * rulePriority.
         *
         * All rules without a specified priority will have incrementing priorities automatically
         * assigned to them, higher than any rules that DO have priorities.
         */
        public fun rulePriority(rulePriority: Number)

        /**
         * @param tagPatternList Select images that have ALL the given patterns in their tag. There
         *   is a maximum limit of four wildcards (*) per string. For example,
         *   ["*test*1*2*3", "test*1*2*3*"] is valid but ["test*1*2*3*4*5*6"] is invalid.
         *
         * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        public fun tagPatternList(tagPatternList: List<String>)

        /**
         * @param tagPatternList Select images that have ALL the given patterns in their tag. There
         *   is a maximum limit of four wildcards (*) per string. For example,
         *   ["*test*1*2*3", "test*1*2*3*"] is valid but ["test*1*2*3*4*5*6"] is invalid.
         *
         * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        public fun tagPatternList(vararg tagPatternList: String)

        /**
         * @param tagPrefixList Select images that have ALL the given prefixes in their tag. Both
         *   tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        public fun tagPrefixList(tagPrefixList: List<String>)

        /**
         * @param tagPrefixList Select images that have ALL the given prefixes in their tag. Both
         *   tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        public fun tagPrefixList(vararg tagPrefixList: String)

        /**
         * @param tagStatus Select images based on tags. Only one rule is allowed to select untagged
         *   images, and it must have the highest rulePriority.
         */
        public fun tagStatus(tagStatus: TagStatus)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecr.LifecycleRule.Builder =
            software.amazon.awscdk.services.ecr.LifecycleRule.builder()

        /** @param description Describes the purpose of the rule. */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * @param maxImageAge The maximum age of images to retain. The value must represent a number
         *   of days. Specify exactly one of maxImageCount and maxImageAge.
         */
        override fun maxImageAge(maxImageAge: Duration) {
            cdkBuilder.maxImageAge(maxImageAge.let(Duration::unwrap))
        }

        /**
         * @param maxImageCount The maximum number of images to retain. Specify exactly one of
         *   maxImageCount and maxImageAge.
         */
        override fun maxImageCount(maxImageCount: Number) {
            cdkBuilder.maxImageCount(maxImageCount)
        }

        /**
         * @param rulePriority Controls the order in which rules are evaluated (low to high). All
         *   rules must have a unique priority, where lower numbers have higher precedence. The
         *   first rule that matches is applied to an image.
         *
         * There can only be one rule with a tagStatus of Any, and it must have the highest
         * rulePriority.
         *
         * All rules without a specified priority will have incrementing priorities automatically
         * assigned to them, higher than any rules that DO have priorities.
         */
        override fun rulePriority(rulePriority: Number) {
            cdkBuilder.rulePriority(rulePriority)
        }

        /**
         * @param tagPatternList Select images that have ALL the given patterns in their tag. There
         *   is a maximum limit of four wildcards (*) per string. For example,
         *   ["*test*1*2*3", "test*1*2*3*"] is valid but ["test*1*2*3*4*5*6"] is invalid.
         *
         * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        override fun tagPatternList(tagPatternList: List<String>) {
            cdkBuilder.tagPatternList(tagPatternList)
        }

        /**
         * @param tagPatternList Select images that have ALL the given patterns in their tag. There
         *   is a maximum limit of four wildcards (*) per string. For example,
         *   ["*test*1*2*3", "test*1*2*3*"] is valid but ["test*1*2*3*4*5*6"] is invalid.
         *
         * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        override fun tagPatternList(vararg tagPatternList: String): Unit =
            tagPatternList(tagPatternList.toList())

        /**
         * @param tagPrefixList Select images that have ALL the given prefixes in their tag. Both
         *   tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        override fun tagPrefixList(tagPrefixList: List<String>) {
            cdkBuilder.tagPrefixList(tagPrefixList)
        }

        /**
         * @param tagPrefixList Select images that have ALL the given prefixes in their tag. Both
         *   tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        override fun tagPrefixList(vararg tagPrefixList: String): Unit =
            tagPrefixList(tagPrefixList.toList())

        /**
         * @param tagStatus Select images based on tags. Only one rule is allowed to select untagged
         *   images, and it must have the highest rulePriority.
         */
        override fun tagStatus(tagStatus: TagStatus) {
            cdkBuilder.tagStatus(tagStatus.let(TagStatus::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecr.LifecycleRule = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecr.LifecycleRule,
    ) : LifecycleRule {
        /**
         * Describes the purpose of the rule.
         *
         * Default: No description
         */
        override fun description(): String? = unwrap(this).getDescription()

        /**
         * The maximum age of images to retain. The value must represent a number of days.
         *
         * Specify exactly one of maxImageCount and maxImageAge.
         */
        override fun maxImageAge(): Duration? = unwrap(this).getMaxImageAge()?.let(Duration::wrap)

        /**
         * The maximum number of images to retain.
         *
         * Specify exactly one of maxImageCount and maxImageAge.
         */
        override fun maxImageCount(): Number? = unwrap(this).getMaxImageCount()

        /**
         * Controls the order in which rules are evaluated (low to high).
         *
         * All rules must have a unique priority, where lower numbers have higher precedence. The
         * first rule that matches is applied to an image.
         *
         * There can only be one rule with a tagStatus of Any, and it must have the highest
         * rulePriority.
         *
         * All rules without a specified priority will have incrementing priorities automatically
         * assigned to them, higher than any rules that DO have priorities.
         *
         * Default: Automatically assigned
         */
        override fun rulePriority(): Number? = unwrap(this).getRulePriority()

        /**
         * Select images that have ALL the given patterns in their tag.
         *
         * There is a maximum limit of four wildcards (*) per string. For example,
         * ["*test*1*2*3", "test*1*2*3*"] is valid but ["test*1*2*3*4*5*6"] is invalid.
         *
         * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        override fun tagPatternList(): List<String> =
            unwrap(this).getTagPatternList() ?: emptyList()

        /**
         * Select images that have ALL the given prefixes in their tag.
         *
         * Both tagPrefixList and tagPatternList cannot be specified together in a rule.
         *
         * Only if tagStatus == TagStatus.Tagged
         */
        override fun tagPrefixList(): List<String> = unwrap(this).getTagPrefixList() ?: emptyList()

        /**
         * Select images based on tags.
         *
         * Only one rule is allowed to select untagged images, and it must have the highest
         * rulePriority.
         *
         * Default: TagStatus.Tagged if tagPrefixList or tagPatternList is given, TagStatus.Any
         * otherwise
         */
        override fun tagStatus(): TagStatus? = unwrap(this).getTagStatus()?.let(TagStatus::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleRule {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecr.LifecycleRule
        ): LifecycleRule = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: LifecycleRule
        ): software.amazon.awscdk.services.ecr.LifecycleRule = (wrapped as Wrapper).cdkObject
    }
}
