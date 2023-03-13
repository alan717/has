SECTIONS
{
  .text : { *(.text .data) }
  .rel.plt :{*(.rel.plt)}
}
