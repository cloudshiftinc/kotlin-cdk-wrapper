package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.IConstruct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Tags
internal constructor(
    private val cdkObject: software.amazon.awscdk.Tags,
) {
    /**
     * add tags to the node of a construct and all its the taggable children.
     *
     * @param key
     * @param value
     * @param props
     */
    public open fun add(key: String, `value`: String) {
        unwrap(this).add(key, `value`)
    }

    /**
     * add tags to the node of a construct and all its the taggable children.
     *
     * @param key
     * @param value
     * @param props
     */
    public open fun add(
        key: String,
        `value`: String,
        props: TagProps,
    ) {
        unwrap(this).add(key, `value`, props.let(TagProps::unwrap))
    }

    /**
     * add tags to the node of a construct and all its the taggable children.
     *
     * @param key
     * @param value
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fb2b6735049e77309b6628e7afe52917e02e71708d8f0dd4544dc7d06bf167a")
    public open fun add(
        key: String,
        `value`: String,
        props: TagProps.Builder.() -> Unit,
    ): Unit = add(key, `value`, TagProps(props))

    /**
     * remove tags to the node of a construct and all its the taggable children.
     *
     * @param key
     * @param props
     */
    public open fun remove(key: String) {
        unwrap(this).remove(key)
    }

    /**
     * remove tags to the node of a construct and all its the taggable children.
     *
     * @param key
     * @param props
     */
    public open fun remove(key: String, props: TagProps) {
        unwrap(this).remove(key, props.let(TagProps::unwrap))
    }

    /**
     * remove tags to the node of a construct and all its the taggable children.
     *
     * @param key
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c4742b9a3643d8117e7e8d28b7ae7d4dd2b8b808e1912cff8b393f359321401")
    public open fun remove(key: String, props: TagProps.Builder.() -> Unit): Unit =
        remove(key, TagProps(props))

    public companion object {
        public fun of(scope: IConstruct): Tags =
            software.amazon.awscdk.Tags.of(scope.let(IConstruct::unwrap)).let(Tags::wrap)

        internal fun wrap(cdkObject: software.amazon.awscdk.Tags): Tags = Tags(cdkObject)

        internal fun unwrap(wrapped: Tags): software.amazon.awscdk.Tags = wrapped.cdkObject
    }
}
